# sql

``` sql

create extension "uuid-ossp";

-- create

CREATE TABLE IF NOT EXISTS public.user
(
    id uuid NOT NULL DEFAULT uuid_generate_v4(),
    name character varying COLLATE pg_catalog."default" NOT NULL,
    email character varying COLLATE pg_catalog."default" NOT NULL,
    password character varying COLLATE pg_catalog."default" NOT NULL,
    create_time timestamp(6) with time zone,
    login_time timestamp(6) with time zone,
    description character varying COLLATE pg_catalog."default",
    token_key character varying COLLATE pg_catalog."default",
    token_expire_time timestamp(6) with time zone,
    is_deleted boolean,
    CONSTRAINT user_pkey PRIMARY KEY (id),
    CONSTRAINT name UNIQUE (name)
)
TABLESPACE pg_default;
ALTER TABLE IF EXISTS public.user
    OWNER to postgres;


CREATE TABLE IF NOT EXISTS public.role
(
    id uuid NOT NULL DEFAULT uuid_generate_v4(),
    name character varying COLLATE pg_catalog."default",
    is_default boolean
)
TABLESPACE pg_default;
ALTER TABLE IF EXISTS public.role
    OWNER to postgres;


CREATE TABLE IF NOT EXISTS public.user_role
(
    user_id uuid NOT NULL,
    role_id uuid NOT NULL,
    create_time timestamp(6) with time zone,
    creater_id uuid
)
TABLESPACE pg_default;
ALTER TABLE IF EXISTS public.user_role
    OWNER to postgres;


CREATE TABLE IF NOT EXISTS public.demo_employee
(
    id uuid NOT NULL DEFAULT uuid_generate_v4(),
    first_name VARCHAR(50),
    last_name VARCHAR(50),
	date_of_birth DATE
)
TABLESPACE pg_default;
ALTER TABLE IF EXISTS public.demo_employee
    OWNER to postgres;


-- insert

INSERT INTO public.user (id, name, email, password) VALUES
  ('7983bd39-6b25-4f70-befd-48b7bddb60ce', 'admin', 'admin@admin.admin', ''),
  ('936e3bb1-8cb1-4285-bfae-ee47bc98cff5', 'user', 'user@user.user', '');

INSERT INTO public.role (id, name, is_default) VALUES
  ('8700bf7e-9b8d-4a0c-ac62-3077983fa7e0', 'ADMIN', false),
  ('b909d662-76e7-411c-b557-8d55828272a5', 'USER', true);

INSERT INTO public.user_role (user_id, role_id) VALUES
  ('7983bd39-6b25-4f70-befd-48b7bddb60ce', '8700bf7e-9b8d-4a0c-ac62-3077983fa7e0'),
  ('936e3bb1-8cb1-4285-bfae-ee47bc98cff5', 'b909d662-76e7-411c-b557-8d55828272a5');

INSERT INTO demo_employee (first_name, last_name, date_of_birth) VALUES
  ('John', 'Doe', '2000-05-15'),
  ('Jane', 'Smith', '2001-08-22'),
  ('Michael', 'Johnson', '1999-12-03'),
  ('Emily', 'Williams', '2002-04-10'),
  ('Daniel', 'Brown', '2003-01-28'),
  ('Olivia', 'Jones', '2001-06-18'),
  ('William', 'Taylor', '2000-09-05'),
  ('Sophia', 'Davis', '2002-11-12'),
  ('Alexander', 'Miller', '1999-07-31'),
  ('Ella', 'Moore', '2003-03-24');

```
