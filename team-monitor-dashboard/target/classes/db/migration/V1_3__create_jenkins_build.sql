CREATE TABLE `jenkins_build` (
    `id` number(10, 0),
    `project_id` number(10, 0),
    `number` number(10, 0),
    `build_success` boolean,
    CONSTRAINT pk_jenkins_build PRIMARY KEY (`id`),
    CONSTRAINT fk_project_jenkins_build FOREIGN KEY (`project_id`) REFERENCES project(id)
);