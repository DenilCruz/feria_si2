.PHONY: up down build logs backend-test frontend-test mobile-test clean

up:
	docker compose up -d

down:
	docker compose down

build:
	docker compose build

logs:
	docker compose logs -f

backend-test:
	cd backend && ./mvnw clean test

frontend-test:
	cd frontend && npm test -- --watch=false --browsers=ChromeHeadless

mobile-test:
	cd mobile && flutter test

clean:
	docker compose down -v
