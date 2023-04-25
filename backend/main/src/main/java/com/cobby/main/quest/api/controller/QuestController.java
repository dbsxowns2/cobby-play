package com.cobby.main.quest.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cobby.main.common.response.BaseResponseBody;
import com.cobby.main.quest.api.service.QuestService;

import lombok.RequiredArgsConstructor;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("api/characters/quest")
public class QuestController {

	private final QuestService questService;

	@GetMapping
	public ResponseEntity<? extends BaseResponseBody> getAllQuests() {
		return ResponseEntity.ok().body(new BaseResponseBody<>(200, "OK", questService.selectAllQuest()));
	}

	@PostMapping
	public ResponseEntity<? extends BaseResponseBody> createQuest() {
		return ResponseEntity.ok().body(new BaseResponseBody<>(200, "Created", "생성되었습니다."));
	}

	@PutMapping
	public ResponseEntity<? extends BaseResponseBody> updateQuest() {
		return ResponseEntity.ok().body(new BaseResponseBody<>(200, "Updated", "수정되었습니다."));
	}

	@DeleteMapping
	public ResponseEntity<? extends BaseResponseBody> deleteQuest() {
		return ResponseEntity.ok().body(new BaseResponseBody<>(200, "Deleted", "삭제되었습니다."));
	}

}
