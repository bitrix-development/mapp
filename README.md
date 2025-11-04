# Chatzy Native (skeleton)

This is a skeleton Android project for the Chatzy messenger native app (Kotlin + Jetpack Compose).

Included:
- Jetpack Compose UI scaffold
- Hilt DI
- Retrofit + OkHttp (API)
- Room (local caching)
- Basic navigation and example screens (chat list + chat)
- Stubs for WebSocket / WebRTC / push integration

Next steps:
1. Provide packageName (if different from com.chatzy.app)
2. Provide backend API specification or confirm that I should create a WebSocket/REST contract
3. Decide on calls strategy: WebRTC (self-host STUN/TURN) or 3rd-party (Agora/Twilio)
4. If you want, I can push this skeleton to the repository or create a PR.
