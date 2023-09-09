import os
import pathlib

path = pathlib.Path(__file__).parent.resolve()

for i in range (5,100):
    os.chdir(path)
    os.mkdir("Challenge " + str(i))
    os.chdir("Challenge " + str(i))
    with open('readme.md', 'a+') as fp:
        pass

