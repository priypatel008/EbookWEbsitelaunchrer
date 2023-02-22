function uploadFile() {
  var fileInput = document.getElementById("bookFile");
  var uploadStatus = document.getElementById("uploadStatus");
  
  if (fileInput.files.length === 0) {
    uploadStatus.innerHTML = "Please select a file to upload.";
    return;
  }
  
  var file = fileInput.files[0];
  
  if (file.size > 10485760) {
    uploadStatus.innerHTML = "File size must be less than 10 MB.";
    return;
  }
  
  // Add your code to handle the file upload here.
  // You can use XMLHttpRequest or fetch to send the file to the server.
}
