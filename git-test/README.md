# GitHub 브랜치 & 병합 연습 문제: 팀 협업 시뮬레이션

## 시나리오

6명의 팀이 간단한 **"팀소개(html , css , js)"** 프로젝트를 진행합니다.  
각자 다른 기능을 개발한 후 `main` 브랜치에 병합해야 하며,  
의도적으로 **충돌(Conflict)**을 발생시켜 해결 과정을 연습합니다.

---

## 1. 저장소 준비

- 팀장이 `team-todo-list` 레포지토리 생성 (GitHub Organization 권장)
- 모든 멤버를 Collaborator로 초대
- 초기 파일: `index.html`, `app.js`, `styles.css` (index.html 파일에 h1 팀명/h1)
- 각각의 개인 과제에 따라 Issue 탭에 Issue 작성
- 개인 과제가 끝남에 따라 Issue close

---

## 2. 개인 과제 (각자 브랜치 생성 → 작업 → PR)

| 멤버 | 브랜치명           | 작업 내용                              | 의도적 충돌 포인트                |
|------|--------------------|----------------------------------------|-----------------------------------|
| A    | `feature/main`     | 메인페이지 기능 추가 (`main.html` 생성)    | `index.html`에 main 링크 추가   |
| B    | `feature/date`     | function app() {간단한 코드} 추가 (`app.js` 수정)     | `app.js` 15번 라인 함수 수정      |
| C    | `feature/color`    | 클래스 선택자로 h1 태그에 color 속성 red (`styles.css` 수정)      | `styles.css` 5번 글자 색상 변경   |
| D    | `feature/console` | app() 함수에 console.log('conflict'); 추가 (`app.js` 수정)   | `app.js` 15번 라인 함수 수정      |
| E    | `feature/background`    | h1 태그에 background 속성 white 추가 (`styles.css` 수정)  | `styles.css` 5번 라인 폰트 추가   |
| F    | `feature/h3` |  index.html 에 h3 영역 추가(`index.html` 수정)  | `index.html`  h1 라인에 h3 추가       |

---

## 3. 강제 충돌 유발 및 해결 단계

1. **첫 번째 PR 병합**
    - `feature/main` → `main` 병합 (성공)

2. **두 번째 PR에서 충돌 발생**
    - `feature/date`와 `feature/console`이 동시에 `app.js` 15번 라인 수정 → 병합 충돌  
      → **해결 방법:** github conflict 해결 or sourcetree conflict 해결

3. **세 번째 PR에서 추가 충돌**
    - `feature/color`와 `feature/background`가 `styles.css` 5번 라인 동시 수정  
      → **해결 방법:** 두 변경사항을 모두 수용해 병합

4. **의도적 오류 발생 및 되돌리기**
    - `feature/h3`에서 `<h1>` 태그를 삭제하는 실수 커밋 → `main`에 병합  
      → **해결 방법:** `git revert [commit-hash]`로 해당 커밋 되돌리기

---

## 4. 작업 절차 안내
1. 로컬에서 원격 Repository Clone
2. 파일 수정 후 수정에 관련 된 메세지와 함께 commit
3. Github 원격 repo 에 push
4. PR 생성 후 팀원들과 코드 리뷰

---

## 5. 학습 포인트 체크리스트

- [ ] 브랜치 생성/전환 숙달
- [ ] PR 생성 및 리뷰 프로세스 이해
- [ ] 충돌 해결 후 `git add .` → `git commit` 재실행
- [ ] `git log --graph`로 병합 히스토리 확인
- [ ] `git revert`로 문제 있는 커밋 취소

---

## 6. 최종 결과 확인

1. `main` 브랜치에서 모든 기능이 정상 작동하는지 확인
2. `styles.css`에서 글자 색상과 배경 색상이 반영되었는 지 확인
3. 되돌린 커밋에서 `<h1>` 태그가 복구되었는지 확인

---
