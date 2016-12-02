package fhj.swengb.assignments.basic

import fhj.model.Github
import fhj.model.Ima2015.Students
import org.scalatest.WordSpec

class Gruppe_CSpec_saved extends WordSpec {

  import fhj.model.Ima2015.Students._


   "Kevin Stessel" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.kstessel.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.kstessel.githubUserName in assert(Github.exists(kstessel), "Github account for Kevin Stessel does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/kiv1995/android-BasicGestureDetect" in assert(Github.exists(kstessel,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Kevin Stesseldoes not exist!")
          "have not committed local.properties" in assert(!Github.exists(kstessel.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a .gitignore file commited" in assert(Github.exists(kstessel.fileIn("android-BasicGestureDetect", ".gitignore")))
          "BasicGestureDetectFragment.scala" in assert(Github.exists(kstessel.fileIn("android-BasicGestureDetect","Application/src/main/scala/com/example/android/basicgesturedetect/BasicGestureDetectFragment.scala")))
          "GestureListener.scala" in assert(Github.exists(kstessel.fileIn("android-BasicGestureDetect","Application/src/main/scala/com/example/android/basicgesturedetect/GestureListener.scala")))
          "MainActivity.scala" in assert(Github.exists(kstessel.fileIn("android-BasicGestureDetect","Application/src/main/scala/com/example/android/basicgesturedetect/MainActivity.scala")))
      }
     }
}
