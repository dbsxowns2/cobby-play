package com.cobby.main.quest.db.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Quest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int questId;

	private String questName;

	private char questType;	// ENUM?

	private int questCode;

	private int costumeId;

	private int aliasId;

}
