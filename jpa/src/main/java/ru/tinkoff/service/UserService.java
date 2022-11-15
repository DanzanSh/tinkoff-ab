package ru.tinkoff.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.tinkoff.dto.UserDto;
import ru.tinkoff.mapper.UserMapper;
import ru.tinkoff.model.User;
import ru.tinkoff.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public Flux<UserDto> getAll() {
        return Mono.just(userRepository.findAll())
                .map(userMapper::toSource)
                .flatMapMany(Flux::fromIterable);
    }

    public Mono<UserDto> getUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException(String.format("User with id = %s not found", id)));
        return Mono.just(userMapper.toSource(user));
    }

    public Mono<UserDto> saveUser(UserDto userDto) {
        User newUser = userMapper.toTarget(userDto);
        return Mono.just(userMapper.toSource(userRepository.save(newUser)));
    }

    public Mono<UserDto> updateUser(Long id, UserDto userDto) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException(String.format("User with id = %s not found", id)));
        User updatedUser = userRepository.save(userMapper.toTarget(user, userDto));
        return Mono.just(userMapper.toSource(updatedUser));
    }

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
}
