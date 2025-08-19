# spring-boot-sample

Spring Boot + PostgreSQL (Docker Compose) 学習用プロジェクト。

- Docker: `docker-compose.yml` で PostgreSQL 16 を起動（ヘルスチェック付き）
- Spring Boot: Web / JPA / Actuator
- DB接続確認: 起動時に `CommandLineRunner` で `SELECT 1`

ローカル実行手順（概要）:
1. Docker で DB 起動: `docker compose up -d`
2. アプリ起動: `./gradlew bootRun` (Windowsは `gradlew.bat bootRun`)
3. 動作確認:
   - `GET http://localhost:8080/hello`
   - `GET http://localhost:8080/actuator/health`
