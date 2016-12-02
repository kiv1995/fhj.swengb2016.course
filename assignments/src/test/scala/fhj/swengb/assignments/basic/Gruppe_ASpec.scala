package fhj.swengb.assignments.basic

import fhj.model.Github
import fhj.model.Ima2015.Students
import org.scalatest.WordSpec

class Gruppe_ASpec extends WordSpec {

  import fhj.model.Ima2015.Students._

   "Elisabeth Fellner" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.efellner.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.efellner.githubUserName in assert(Github.exists(efellner), "Github account for Elisabeth Fellner does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/ellifellner/android-BasicGestureDetect" in assert(Github.exists(efellner,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Elisabeth Fellnerdoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(efellner.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(efellner.fileIn("android-BasicGestureDetect", ".gitignore")))
          "BasicGestureDetectFragment.scala" in assert(Github.exists(efellner.fileIn("android-BasicGestureDetect","Application/src/main/scala/com/example/android/basicgesturedetect/BasicGestureDetectFragment.scala")))
          "GestureListener.scala" in assert(Github.exists(efellner.fileIn("android-BasicGestureDetect","Application/src/main/scala/com/example/android/basicgesturedetect/GestureListener.scala")))
         "MainActivity.scala" in assert(Github.exists(efellner.fileIn("android-BasicGestureDetect","Application/src/main/scala/com/example/android/basicgesturedetect/MainActivity.scala")))
       }
     }
      
   "Vanessa Fortmüller" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.vfortmueller.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.vfortmueller.githubUserName in assert(Github.exists(vfortmueller), "Github account for Vanessa Fortmüller does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/fortmuel15/android-BasicGestureDetect" in assert(Github.exists(vfortmueller,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Vanessa Fortmüllerdoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(vfortmueller.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(vfortmueller.fileIn("android-BasicGestureDetect", ".gitignore")))
          "BasicGestureDetectFragment.scala" in assert(Github.exists(vfortmueller.fileIn("android-BasicGestureDetect","Application/src/main/scala/com/example/android/basicgesturedetect/BasicGestureDetectFragment.scala")))
          "GestureListener.scala" in assert(Github.exists(vfortmueller.fileIn("android-BasicGestureDetect","Application/src/main/scala/com/example/android/basicgesturedetect/GestureListener.scala")))
         "MainActivity.scala" in assert(Github.exists(vfortmueller.fileIn("android-BasicGestureDetect","Application/src/main/scala/com/example/android/basicgesturedetect/MainActivity.scala")))
       }
     }
      
   "Philipp Göschl" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.pgoeschl.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.pgoeschl.githubUserName in assert(Github.exists(pgoeschl), "Github account for Philipp Göschl does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/philgoeschl/android-BasicGestureDetect" in assert(Github.exists(pgoeschl,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Philipp Göschldoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(pgoeschl.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(pgoeschl.fileIn("android-BasicGestureDetect", ".gitignore")))
          "BasicGestureDetectFragment.scala" in assert(Github.exists(pgoeschl.fileIn("android-BasicGestureDetect","Application/src/main/scala/com/example/android/basicgesturedetect/BasicGestureDetectFragment.scala")))
          "GestureListener.scala" in assert(Github.exists(pgoeschl.fileIn("android-BasicGestureDetect","Application/src/main/scala/com/example/android/basicgesturedetect/GestureListener.scala")))
         "MainActivity.scala" in assert(Github.exists(pgoeschl.fileIn("android-BasicGestureDetect","Application/src/main/scala/com/example/android/basicgesturedetect/MainActivity.scala")))
       }
     }
      
   "Miriam Grainer" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.mgrainer.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.mgrainer.githubUserName in assert(Github.exists(mgrainer), "Github account for Miriam Grainer does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/mimschi/android-BasicGestureDetect" in assert(Github.exists(mgrainer,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Miriam Grainerdoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(mgrainer.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(mgrainer.fileIn("android-BasicGestureDetect", ".gitignore")))
          "BasicGestureDetectFragment.scala" in assert(Github.exists(mgrainer.fileIn("android-BasicGestureDetect","Application/src/main/scala/com/example/android/basicgesturedetect/BasicGestureDetectFragment.scala")))
          "GestureListener.scala" in assert(Github.exists(mgrainer.fileIn("android-BasicGestureDetect","Application/src/main/scala/com/example/android/basicgesturedetect/GestureListener.scala")))
         "MainActivity.scala" in assert(Github.exists(mgrainer.fileIn("android-BasicGestureDetect","Application/src/main/scala/com/example/android/basicgesturedetect/MainActivity.scala")))
       }
     }
      
   "Alexander Horina" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.ahorina.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.ahorina.githubUserName in assert(Github.exists(ahorina), "Github account for Alexander Horina does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/horinaal15/android-BasicGestureDetect" in assert(Github.exists(ahorina,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Alexander Horinadoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(ahorina.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(ahorina.fileIn("android-BasicGestureDetect", ".gitignore")))
          "BasicGestureDetectFragment.scala" in assert(Github.exists(ahorina.fileIn("android-BasicGestureDetect","Application/src/main/scala/com/example/android/basicgesturedetect/BasicGestureDetectFragment.scala")))
          "GestureListener.scala" in assert(Github.exists(ahorina.fileIn("android-BasicGestureDetect","Application/src/main/scala/com/example/android/basicgesturedetect/GestureListener.scala")))
         "MainActivity.scala" in assert(Github.exists(ahorina.fileIn("android-BasicGestureDetect","Application/src/main/scala/com/example/android/basicgesturedetect/MainActivity.scala")))
       }
     }
      
   "Viktor Ielnykov" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.vielnykov.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.vielnykov.githubUserName in assert(Github.exists(vielnykov), "Github account for Viktor Ielnykov does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/ielnykov/android-BasicGestureDetect" in assert(Github.exists(vielnykov,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Viktor Ielnykovdoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(vielnykov.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(vielnykov.fileIn("android-BasicGestureDetect", ".gitignore")))
          "BasicGestureDetectFragment.scala" in assert(Github.exists(vielnykov.fileIn("android-BasicGestureDetect","Application/src/main/scala/com/example/android/basicgesturedetect/BasicGestureDetectFragment.scala")))
          "GestureListener.scala" in assert(Github.exists(vielnykov.fileIn("android-BasicGestureDetect","Application/src/main/scala/com/example/android/basicgesturedetect/GestureListener.scala")))
         "MainActivity.scala" in assert(Github.exists(vielnykov.fileIn("android-BasicGestureDetect","Application/src/main/scala/com/example/android/basicgesturedetect/MainActivity.scala")))
       }
     }
      
   "Felix Rauchewald" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.frauchenwald.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.frauchenwald.githubUserName in assert(Github.exists(frauchenwald), "Github account for Felix Rauchewald does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/MrOrange1992/android-BasicGestureDetect" in assert(Github.exists(frauchenwald,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Felix Rauchewalddoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(frauchenwald.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(frauchenwald.fileIn("android-BasicGestureDetect", ".gitignore")))
          "BasicGestureDetectFragment.scala" in assert(Github.exists(frauchenwald.fileIn("android-BasicGestureDetect","Application/src/main/scala/com/example/android/basicgesturedetect/BasicGestureDetectFragment.scala")))
          "GestureListener.scala" in assert(Github.exists(frauchenwald.fileIn("android-BasicGestureDetect","Application/src/main/scala/com/example/android/basicgesturedetect/GestureListener.scala")))
         "MainActivity.scala" in assert(Github.exists(frauchenwald.fileIn("android-BasicGestureDetect","Application/src/main/scala/com/example/android/basicgesturedetect/MainActivity.scala")))
       }
     }
      
   "Lukas Schneider" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.lschneider.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.lschneider.githubUserName in assert(Github.exists(lschneider), "Github account for Lukas Schneider does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/schneider-IMA15/android-BasicGestureDetect" in assert(Github.exists(lschneider,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Lukas Schneiderdoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(lschneider.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(lschneider.fileIn("android-BasicGestureDetect", ".gitignore")))
          "BasicGestureDetectFragment.scala" in assert(Github.exists(lschneider.fileIn("android-BasicGestureDetect","Application/src/main/scala/com/example/android/basicgesturedetect/BasicGestureDetectFragment.scala")))
          "GestureListener.scala" in assert(Github.exists(lschneider.fileIn("android-BasicGestureDetect","Application/src/main/scala/com/example/android/basicgesturedetect/GestureListener.scala")))
         "MainActivity.scala" in assert(Github.exists(lschneider.fileIn("android-BasicGestureDetect","Application/src/main/scala/com/example/android/basicgesturedetect/MainActivity.scala")))
       }
     }
      
   "Nikolaus Spieß" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.nspiess.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.nspiess.githubUserName in assert(Github.exists(nspiess), "Github account for Nikolaus Spieß does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/MrBrown1992/android-BasicGestureDetect" in assert(Github.exists(nspiess,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Nikolaus Spießdoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(nspiess.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(nspiess.fileIn("android-BasicGestureDetect", ".gitignore")))
          "BasicGestureDetectFragment.scala" in assert(Github.exists(nspiess.fileIn("android-BasicGestureDetect","Application/src/main/scala/com/example/android/basicgesturedetect/BasicGestureDetectFragment.scala")))
          "GestureListener.scala" in assert(Github.exists(nspiess.fileIn("android-BasicGestureDetect","Application/src/main/scala/com/example/android/basicgesturedetect/GestureListener.scala")))
         "MainActivity.scala" in assert(Github.exists(nspiess.fileIn("android-BasicGestureDetect","Application/src/main/scala/com/example/android/basicgesturedetect/MainActivity.scala")))
       }
     }
      
   "Maximilian Steiner" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.msteiner.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.msteiner.githubUserName in assert(Github.exists(msteiner), "Github account for Maximilian Steiner does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/MrPink1992/android-BasicGestureDetect" in assert(Github.exists(msteiner,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Maximilian Steinerdoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(msteiner.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(msteiner.fileIn("android-BasicGestureDetect", ".gitignore")))
          "BasicGestureDetectFragment.scala" in assert(Github.exists(msteiner.fileIn("android-BasicGestureDetect","Application/src/main/scala/com/example/android/basicgesturedetect/BasicGestureDetectFragment.scala")))
          "GestureListener.scala" in assert(Github.exists(msteiner.fileIn("android-BasicGestureDetect","Application/src/main/scala/com/example/android/basicgesturedetect/GestureListener.scala")))
         "MainActivity.scala" in assert(Github.exists(msteiner.fileIn("android-BasicGestureDetect","Application/src/main/scala/com/example/android/basicgesturedetect/MainActivity.scala")))
       }
     }
      
   "Markus Wolf" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.mwolf.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.mwolf.githubUserName in assert(Github.exists(mwolf), "Github account for Markus Wolf does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/MarkusWolfIMA/android-BasicGestureDetect" in assert(Github.exists(mwolf,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Markus Wolfdoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(mwolf.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(mwolf.fileIn("android-BasicGestureDetect", ".gitignore")))
          "BasicGestureDetectFragment.scala" in assert(Github.exists(mwolf.fileIn("android-BasicGestureDetect","Application/src/main/scala/com/example/android/basicgesturedetect/BasicGestureDetectFragment.scala")))
          "GestureListener.scala" in assert(Github.exists(mwolf.fileIn("android-BasicGestureDetect","Application/src/main/scala/com/example/android/basicgesturedetect/GestureListener.scala")))
         "MainActivity.scala" in assert(Github.exists(mwolf.fileIn("android-BasicGestureDetect","Application/src/main/scala/com/example/android/basicgesturedetect/MainActivity.scala")))
       }
     }
      

}
