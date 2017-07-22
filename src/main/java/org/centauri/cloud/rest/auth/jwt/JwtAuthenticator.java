package org.centauri.cloud.rest.auth.jwt;

import io.dropwizard.auth.AuthenticationException;
import io.dropwizard.auth.Authenticator;
import org.centauri.cloud.rest.auth.AuthException;

import java.security.Principal;
import java.util.Optional;

public class JwtAuthenticator implements Authenticator<String, Principal> {
	@Override
	public Optional<Principal> authenticate(String jwt) throws AuthenticationException {
		try {
			JwtUser user = JWTUtil.validateJWT(jwt);
			return Optional.of(user);
		} catch (AuthException e) {
			return Optional.empty();
		}
	}
}