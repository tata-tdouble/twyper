![](cover.jpeg)

# twyper

![buildStatus](https://img.shields.io/github/workflow/status/theapache64/twyper/Java%20CI%20with%20Gradle?style=plastic)
![latestVersion](https://img.shields.io/github/v/release/theapache64/twyper)
<a href="https://twitter.com/theapache64" target="_blank">
<img alt="Twitter: theapache64" src="https://img.shields.io/twitter/follow/theapache64.svg?style=social" />
</a>

> Yet another Tinder like swipeable card library, built for Jetpack Compose
>
> This is an update of the original repo. I have added Swipe Up and Swipe Dwn functionalities.

### ✨ Demo

https://user-images.githubusercontent.com/9678279/154856283-c38be412-387c-4b25-a612-01fea39829f1.mov

## ⌨️ Usage

![latestVersion](https://img.shields.io/github/v/release/theapache64/twyper)

### 1. Add dependency
```groovy
repositories {
  maven { url 'https://jitpack.io' } // Add jitpack
}

dependencies {
  implementation 'com.github.tata-tdouble:twyper:<latest.version>'
}
```

### 2. Use `Twyper` composable

```kotlin
val items = remember { mutableStateListOf(*('A'..'Z').toList().toTypedArray()) }

//  twyperController to swipe cards programmatically
val twyperController = rememberTwyperController() 
Twyper(
    items = items,
    twyperController = twyperController, // optional
    onItemRemoved = { item, direction ->
        println("Item removed: $item -> $direction")
        items.remove(item)
    },
    onEmpty = { // invoked when the stack is empty
        println("End reached")
    }
) { item ->
    // card content goes here
}

```
- See full source code [here](https://github.com/theapache64/twyper/blob/b4c21e76928ed888c9c1230ca9e3ac4711d8cf5a/sample/src/main/java/com/github/theapache64/twyper/TwyperPreview.kt#L20)

### 3. Use `TwyperFlip` composable
```kotlin
val items = remember { mutableStateListOf(*('A'..'Z').toList().toTypedArray()) }

//  twyperFlipController to swipe cards programmatically
val twyperFlipController = rememberTwyperFlipController()

val generateBoxModifier: () -> Modifier = {
    //return Modifier for the card
}

TwyperFlip(
    items = items,
    twyperFlipController = twyperFlipController,
    onItemRemoved = { item, direction ->
        println("Item removed: $item -> $direction")
        items.remove(item)
    },
    cardModifier = generateBoxModifier,
    onEmpty = {  
        println("End reached")
    },
    front = { item ->
        // card content goes here
    },
    back = { item ->
       // card content when flipped goes here
    })
```
- See full source code [here](https://github.com/yash-k9/twyper/blob/master/sample/src/main/java/com/github/theapache64/twyper/TwyperFlipPreview.kt)

## 🧪 More Samples

- [Swipe Search](https://github.com/theapache64/swipe-search)

https://user-images.githubusercontent.com/9678279/154852171-184ff026-f2e4-4ff7-9782-4ab3d9947bf7.mov

- [Swipe Search Flip](https://github.com/theapache64/swipe-search)

https://user-images.githubusercontent.com/59912430/157506600-6fc784c7-e7f5-40ae-b6fe-d369876e7908.mp4

- [TwyperFlip Demo](https://github.com/yash-k9/twyper/blob/master/sample/src/main/java/com/github/theapache64/twyper/TwyperFlipPreview.kt)

https://user-images.githubusercontent.com/59912430/157507083-77e646d6-e735-4227-abb6-f13c56e217dc.mp4


## ✍️ Author

👤 **theapache64**

* Twitter: <a href="https://twitter.com/theapache64" target="_blank">@theapache64</a>
* Email: theapache64@gmail.com

Feel free to ping me 😉

## 🤝 Contributing

Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any
contributions you make are **greatly appreciated**.

1. Open an issue first to discuss what you would like to change.
1. Fork the Project
1. Create your feature branch (`git checkout -b feature/amazing-feature`)
1. Commit your changes (`git commit -m 'Add some amazing feature'`)
1. Push to the branch (`git push origin feature/amazing-feature`)
1. Open a pull request

Please make sure to update tests as appropriate.

## ❤ Show your support

Give a ⭐️ if this project helped you!

<a href="https://www.patreon.com/theapache64">
  <img alt="Patron Link" src="https://c5.patreon.com/external/logo/become_a_patron_button@2x.png" width="160"/>
</a>

<a href="https://www.buymeacoffee.com/theapache64" target="_blank">
    <img src="https://cdn.buymeacoffee.com/buttons/v2/default-yellow.png" alt="Buy Me A Coffee" width="160">
</a>

## ☑️ TODO

- [ ] Add UI tests and unit tests

## 📝 License

```
Copyright © 2022 - theapache64

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

_This README was generated by [readgen](https://github.com/theapache64/readgen)_ ❤
