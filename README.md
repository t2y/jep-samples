# jep-samples

jep sample code

## How to create build environment with virtualenv on macOS

### Create virtualenv

```bash
$ mkvirtualenv -p python3 myjep
(myjep) $ python --version
Python 3.7.0
```

### Install Jep to virtualenv

```bash
(myjep) $ git clone https://github.com/ninia/jep.git
(myjep) $ cd jep
(myjep) $ python setup.py build
(myjep) $ python setup.py install
(myjep) $ find path/to/.virtualenvs/myjep -name "*.jnilib"
path/to/.virtualenvs/myjep/lib/python3.7/site-packages/jep/libjep.jnilib
```

### Compile sample java sources

```bash
(myjep) $ cd path/to/jep-samples/src/
(myjep) $ export CLASSPATH=".:path/to/.virtualenvs/myjep/lib/python3.7/site-packages/jep/jep-3.8.2.jar"
(myjep) $ javac HelloWorld.java  # HelloWorld.class will be created
```

## How to run class file with virtualenv on macOS

```bash
(myjep) $ export PYTHONHOME="path/to/.virtualenvs/myjep"
(myjep) $ export LD_LIBRARY_PATH=".:path/to/.virtualenvs/myjep/lib/python3.7/site-packages/jep"
(myjep) $ java HelloWorld
Hello World
Hello World
ello Worl
```
