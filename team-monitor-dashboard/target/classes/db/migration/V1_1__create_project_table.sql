CREATE TABLE `project` (
    `id` number(10, 0),
    `team_id` number(10, 0),
    `name` varchar2(255 char),
    `code` varchar2(255 char),
    `current_tag` varchar2(255 char),
    `is_deployed` boolean,
    `last_update` timestamp,
    `up_to_date` boolean,
    CONSTRAINT pk_project PRIMARY KEY (`id`),
    CONSTRAINT fk_team_project FOREIGN KEY (`team_id`) REFERENCES team(id)
);