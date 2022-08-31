package com.kasidev.users.api;

import com.kasidev.users.model.Entitlement;

import java.util.Optional;

public interface EntitlementService {

    Entitlement createEntitlement(String name);

    Optional<Entitlement> findEntitlementById(Long id);

    Entitlement addGroupToEntitlement(Long entitlementId, Long groupId);
}
