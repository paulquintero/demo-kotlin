
CREATE TABLE public.cat_personas
(
    id SERIAL NOT NULL ,
    nombre character varying(200) COLLATE pg_catalog."default",
    ine character varying(20) COLLATE pg_catalog."default",
    appaterno character varying(200) COLLATE pg_catalog."default",
    apmaterno character varying(200) COLLATE pg_catalog."default",
    fechanacimiento date,
    CONSTRAINT personas_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE public.cat_personas
    OWNER to postgres;


