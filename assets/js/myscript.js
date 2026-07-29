//------------------------------------------------------------------//
function Kirim(){
  Komentor = document.getElementById("name").value;
  if (Komentor == "" ||!Komentor){
    swal("Opps..", "Isi Nama dulu dong!");
  }else{
    Komentor = document.getElementById("name").value;
    email = document.getElementById("email").value;
    Project = document.getElementById("project").value;
    Pesan = document.getElementById("message").value;
    firebase.database().ref('Pesan/'+Komentor).set({
      Nama: Komentor,
      Alamat_Email: email,
      Project: project,
      Pesan:message

    });
    swal("Arigatou", "Kritik & Saran Kamu, sudah berhasil direcord!"); 
  }
};