package ru.tinkoff.mapper;

import org.springframework.stereotype.Component;
import ru.tinkoff.dto.UserDto;
import ru.tinkoff.mapper.mapper.AbstractBidirectionalMapper;
import ru.tinkoff.model.User;

@Component
public class UserMapper extends AbstractBidirectionalMapper<UserDto, User> {
    @Override
    public UserDto toSource(User target) {
        return new UserDto(target.getId(), target.getFirstName(), target.getLastName());
    }

    @Override
    public User toTarget(UserDto source) {
        User user = new User();
        user.setId(source.getId());
        user.setFirstName(source.getFirstName());
        user.setLastName(source.getLastName());
        return user;
    }

    public User toTarget(User user, UserDto dto) {
        user.setFirstName(dto.getFirstName());
        user.setLastName(dto.getLastName());
        return user;
    }
}
