# jep-samples

[Jep](https://github.com/ninia/jep) sample code

## How to create build environment with virtualenv on macOS

### Create virtualenv

```bash
$ mkvirtualenv -p python3 jep
(jep) $ python --version
Python 3.7.0
```

### Install Jep to virtualenv

```bash
(jep) $ git clone https://github.com/ninia/jep.git
(jep) $ cd jep
(jep) $ python setup.py build
(jep) $ python setup.py install
(jep) $ find path/to/.virtualenvs/jep -name "*.jnilib"
path/to/.virtualenvs/jep/lib/python3.7/site-packages/jep/libjep.jnilib
```

### Compile sample java sources

```bash
(jep) $ cd path/to/jep-samples/src/
(jep) $ export CLASSPATH=".:path/to/.virtualenvs/jep/lib/python3.7/site-packages/jep/jep-3.8.2.jar"
(jep) $ javac *.java  # some class files will be created
```

## How to run class file with virtualenv on macOS

```bash
(jep) $ export PYTHONHOME="path/to/.virtualenvs/jep"
(jep) $ export PYTHONPATH="."
(jep) $ export LD_LIBRARY_PATH=".:path/to/.virtualenvs/jep/lib/python3.7/site-packages/jep"
```

```bash
(jep) $ java HelloWorld
Hello World
Hello World
ello Worl
```

```bash
(jep) $ java ImportModule
add(5, 3) = 8
sub(5, 3) = 2
cals([1, 2, 3, 4, 5]) = 15
```

```bash
(jep) $ java RunScript
add and sub: 6
calc: 45
```

## Confirm run with 3rd party libraries using C Extensions

```bash
(jep) $ pip install numpy pandas scipy scikit-learn
(jep) $ pip freeze
jep==3.8.2
numpy==1.15.2
pandas==0.23.4
python-dateutil==2.7.3
pytz==2018.5
scikit-learn==0.20.0
scipy==1.1.0
six==1.11.0
```

```bash
(jep) $ javac -Xlint:unchecked UseNumPy.java && java UseNumPy
```
