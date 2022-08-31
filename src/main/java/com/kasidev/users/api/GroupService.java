package com.kasidev.users.api;

import com.kasidev.users.model.Group;
import com.kasidev.users.model.User;

import java.util.List;
import java.util.Optional;

public interface GroupService {

    Group createGroup(Group group);

    Group addUserToGroup(Long groupId, Long userId);

    Group removeUserFromGroup(Long groupId, Long userId);

    Optional<Group> findGroupById(Long id);

    List<User> findGroupUsers(Long id);
}
