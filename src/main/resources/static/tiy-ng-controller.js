//angular.module('TIYAngularApp', [])
//   .controller('SampleController', function($scope, $http) {
//        $scope.name = "James";
//
//        $scope.newTodo = {};
//
//        $scope.whateverIWantToComeUpWith = "Isn't that something...";
//
//        $scope.testVar = {};
//
//        $scope.testVar.sampleContainerVar = "isn't that something else";
//
//        $scope.testVar.anotherSample = 12;
//        $scope.testVar.flagExample = false;
//
//        $scope.getTodos = function() {
//               console.log("About to go get me some data!");
//               $scope.name = "JavaScript Master Guru";
//
//               $http.get("http://localhost:8080/todos.json")
//                   .then(
//                       function successCallback(response) {
//                           console.log(response.data);
//                           console.log("Adding data to scope");
//                           $scope.todos = response.data;
//                       },
//                       function errorCallback(response) {
//                           console.log("Unable to get data");
//                       });
//                       console.log("Done with the promise - waiting for the callback");
//                };
//
//                        $scope.toggleTodo = function(todoID) {
//                            console.log("About to toggle todo with ID " + todoID);
//
//                            $http.get("/toggleTodo.json?todoID=" + todoID)
//                                .then(
//                                    function success(response) {
//                                        console.log(response.data);
//                                        console.log("Todo toggled");
//
//                                        $scope.todos = {};
//
//                                        alert("About to refresh the todos on the scope");
//
//                                        $scope.todos = response.data;
//                                    },
//                                    function error(response) {
//                                        console.log("Unable to toggle todo");
//                                    });
//                        };
//
//                        $scope.deleteTodo = function(todoID) {
//                            console.log("About to delete todo with ID " + todoID);
//
//                            $http.get("/deleteTodo.json?todoID=" + todoID)
//                                .then(
//                                    function success(response) {
//                                        console.log(response.data);
//                                        console.log("Todo deleted");
//
//                                        $scope.todos = {};
//
//                                        alert("About to refresh the todos on the scope");
//
//                                        $scope.todos = response.data;
//                                    },
//                                    function error(response) {
//                                        console.log("Unable to delete todo");
//                                    });
//                        };
//
//        $scope.addTodo = function() {
//            console.log("About to add the following todo " + JSON.stringify($scope.newTodo));
//
//            $http.post("/addTodo.json", $scope.newTodo)
//                .then(
//                    function successCallback(response) {
//                        console.log(response.data);
//                        console.log("Adding data to scope");
//                        $scope.todos = response.data;
//                    },
//                    function errorCallback(response) {
//                        console.log("Unable to get data");
//                    });
//        };
//
//
//
//    });
angular.module('TIYAngularApp', [])
   .controller('SampleController', function($scope, $http, $timeout) {//angular injects these for us. the framework is getting these parameters


        $scope.makeArray = function(arraySize) {
            var returnArray = [];

            for (var i = 0; i < arraySize; i++) {
                returnArray.push(i);
            }
            return returnArray;
        };

//        $scope.testTimeout = function(){
//           console.log("testTimeout() is running")
//           if($scope.numBigs > 5)
//           {
//           return;
//           }
//           else
//           {
//           $scope.numBigs += 1;
//           $timeout($scope.testTimeout, 1000)
//           }
//           };
         $scope.testTimeout = function(){
//                                console.log("testTimeout() is running")
//                     console.log("count = " + count);
//
//                                if(count == $scope.numBigs)
//                                {
//                                return;
//                                }
//                                else
//                                {
//                                count += 1;
//                                $timeout($scope.testTimeout, 1000)
//                                }
                                };
        $scope.sendChocolate = function(){
                   console.log("sendChocolate() is running")
                    $http.get("/makeChocolate.json?smalls=" + $scope.numSmalls + "&bigs=" + $scope.numBigs + "&kilos=" + $scope.numKilos)
                    .then(
                        function success(response) {
                            console.log(response.data);
                            console.log("Chocolate is possible");

                            $scope.result = {};

                            alert("About to add solution on the scope");

                            $scope.result = response.data;
                            if($scope.result.returnValue == -1)
                            {
                                $scope.result.numBigsNeeded = 0;
                                $scope.result.numSmallsNeeded = 0;

                            }
                            $scope.numBigs -= $scope.result.numBigsNeeded;
                            $scope.numSmalls -= $scope.result.numSmallsNeeded;

                        },
                        function error(response) {
                            console.log("Unable to add solution on the scope");
                        });
                   };
$timeout($scope.testTimeout, 3000);
       $scope.newText = "that is crazy";
        //$scope.numBigs;
var count = 1;
var smalls = $scope.numSmalls;
var bigs = $scope.numBigs;
var kilos = $scope.numKilos;
        console.log("the controller is up");

   });

