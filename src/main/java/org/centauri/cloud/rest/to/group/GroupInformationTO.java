package org.centauri.cloud.rest.to.group;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GroupInformationTO {

	private String name;
	private String description;
	private boolean active;
	private String[] permissions;
}