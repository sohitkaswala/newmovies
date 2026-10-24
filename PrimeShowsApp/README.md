# PrimeShows Android WebView starter

A starter Android project for loading `https://primeshows.org/` on phones, tablets and Android TV.

## Build with GitHub Actions
1. Create a GitHub repository.
2. Upload the contents of this folder to the repository root.
3. Open **Actions** and run **Build Android APK** (or push to `main`/`master`).
4. Download the `PrimeShows-debug-apk` artifact from the successful run.

## Build locally
Install Android Studio and JDK 17, then run `gradle assembleDebug` from the project root, or import the project in Android Studio.

## Notes
- This is a starter project, not a verified production release. Test it on your specific phones, tablets, Android TV devices, and video players.
- Android orientation is unspecified, so the app can rotate with the device. The site itself must support the chosen layout.
- The WebView blocks requests to a short list of known ad-network hostnames. This is best-effort and cannot remove every ad, server-side inserted ad, same-domain ad, or video-player ad. The block list may also need maintenance.
- The app does not bypass subscriptions, DRM, login requirements, or site access controls.
- Review the website's trustworthiness, terms, and content distribution permissions before publishing or sharing this app.
