Jenkins CI/CD multibranch pipeline:

1.Click on New Item link to create a job on Jenkins for multibranch pipeline. 
It helps you to accelerate the continues test and integration with new deployment.
2.Configure your project repository as per git and add credentials.
3.Add pom.xml in maven build and clean install in that part of jenkins.
4.Add your git project branch url on jenkins configuration.
5.Add also the cucumber report at post build section.
6.YOu can add secret properties file the part of "Build Environment" on jenkins.
7.Apply and build the job on your branch after scanning multiple branch pipeline and get your result on console output.


Every commit gets tested and if successful, it is turned into a release that always gets deployed to production through 
your maven pom.xml used for dependency management.
pom.xml gets modified all the time and merge conflicts on the basis of new adding on the branch.