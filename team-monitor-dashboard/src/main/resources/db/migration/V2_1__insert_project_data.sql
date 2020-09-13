INSERT INTO `project` (`id`, `team_id`, `name`, `code`, `current_tag`, `is_deployed`, `last_update`, `up_to_date`)
VALUES (seq_project.nextval, 1, 'OMNICHANNEL_DINERS_DEV', 'ECB3994', 'B2', 0, systimestamp, true);

INSERT INTO `project` (`id`, `team_id`, `name`, `code`, `current_tag`, `is_deployed`, `last_update`, `up_to_date`)
VALUES (seq_project.nextval, 1, 'STREAMLINE_POS_AUTH_RESPONSE_CODES_DEV', 'E20092', 'B9', 1, systimestamp, false);

INSERT INTO `project` (`id`, `team_id`, `name`, `code`, `current_tag`, `is_deployed`, `last_update`, `up_to_date`)
VALUES (seq_project.nextval, 1, 'WECHAT_PAY_POS_TEAM17_DEV', 'WP23355', 'B1', 0, systimestamp, false);