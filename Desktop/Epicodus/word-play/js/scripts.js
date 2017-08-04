// $(document).ready(function() {
//   $("#word-play").submit(function(event){
//     alert("hi");
//     event.preventDefault();
//     var firstName = $("#firstName").val();
//     var words = firstName.split(' ');
//     var newWords = words.filter(function(word) {
//       return word.length >=3;
//     });
//     newWords.reverse();
//     var results = newWords.join();
//     $(".test").append(results);
//     $("#display").show();
//     });
// })
$(document).ready(function() {
  $("#word-play").submit(function(event){

    var firstName = $("#firstName").val();
    var words = firstName.split('');
    alert(words);
    var newWords = words.filter(function(word){
      return word.length >= 3;
    });
    alert(newWords);
    newWords.reverse();
    var results = newWords.join(' ');
    $(".test").append(results);
    $("#display").show();
    event.preventDefault();
    });
})
