# Agni
Android app template for modular apps with Dagger 2, Coroutines, LiveData, ViewModel and RxJava 2.

# Contains
* **[Dagger 2](https://dagger.dev/)**: Dependency injection
* **[Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html)**: Async.
* **[Reactive streams](https://github.com/ReactiveX/RxJava)**: Networking & Async.
* **[LiveData and ViewModel](https://developer.android.com/topic/libraries/architecture)**: Isolate business logic and maintain state.

# Usage
* `app` module is where the application initializes 
* Create a dynamic module like **[characters](https://github.com/karntrehan/Starwars/blob/master/characters/build.gradle)**. 
* Add the module's navigation to `NavigationExtension`

# Contribution
Feel free to open an issue or submit a pull request with improvements.

# Licence
    MIT License

    Copyright (c) 2019 Karan Trehan
    
    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:
    
    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.
    
    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.    