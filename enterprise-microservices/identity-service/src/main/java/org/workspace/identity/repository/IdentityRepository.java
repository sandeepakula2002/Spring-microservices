package org.workspace.identity.repository;

import org.workspace.identity.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdentityRepository extends JpaRepository<UserProfile, Long> {}
