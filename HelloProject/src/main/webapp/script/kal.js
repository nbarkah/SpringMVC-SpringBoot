function myFunction(){
    var temp1 = parseInt(document.form1.input1.value);
    var temp2 = parseInt(document.form1.input2.value);
    var pilih = document.form1.opsi.value;

        if (pilih == "tambah") {
            var z = temp1 + temp2;
        } else if (pil == "kurang") {
            var z = temp1 - temp2;
        }
        
        document.form1.input1.value = "";
        document.form1.input2.value = "";
        document.form1.hasil.value = z;
    }