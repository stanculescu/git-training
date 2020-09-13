INSERT INTO `jenkins_build` (`id`, `project_id`, `number`, `build_success`)
VALUES (seq_jenkins_build.nextval, 1, 1, true);

INSERT INTO `jenkins_build` (`id`, `project_id`, `number`, `build_success`)
VALUES (seq_jenkins_build.nextval, 1, 2, true);

INSERT INTO `jenkins_build` (`id`, `project_id`, `number`, `build_success`)
VALUES (seq_jenkins_build.nextval, 2, 5, false);

INSERT INTO `jenkins_build` (`id`, `project_id`, `number`, `build_success`)
VALUES (seq_jenkins_build.nextval, 2, 6, true);

INSERT INTO `jenkins_build` (`id`, `project_id`, `number`, `build_success`)
VALUES (seq_jenkins_build.nextval, 2, 7, false);

INSERT INTO `jenkins_build` (`id`, `project_id`, `number`, `build_success`)
VALUES (seq_jenkins_build.nextval, 3, 1, false);