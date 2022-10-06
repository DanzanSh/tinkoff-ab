CREATE TABLE IF NOT EXISTS customer
(
    id SERIAL PRIMARY KEY,
    first_name varchar,
    last_name varchar
);

do $$
    begin
        for r in 1..10 loop
                insert into customer(first_name, last_name)
                values ('Maarten','Smeets');
            end loop;
    end;
$$;