CREATE TABLE `sonar` (
    `id` number(10, 0),
    `project_id` number(10, 0),
    `lines_to_cover` number(10, 0),
    `uncovered_lines` number(10, 0),
    `conditions_to_cover` number(10, 0),
    `uncovered_conditions` number(10, 0),
    `last_update` timestamp,
    CONSTRAINT pk_sonar PRIMARY KEY (`id`),
    CONSTRAINT fk_project_sonar FOREIGN KEY (`project_id`) REFERENCES project(id)
);