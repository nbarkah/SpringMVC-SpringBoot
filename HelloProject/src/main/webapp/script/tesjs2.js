// const fullName = "Nurhai Barkah";
// const template = `Name : ${fullName}`;

const tambah = document.querySelector("btn-tambah");
tambah.onClick = function () {
    let input1 = parseInt(document.getElementById("1").value);
    let input2 = parseInt(document.getElementById("2").value);

    document.getElementById("hasil").innerHTML = input1 + input2;
}

const kurang = document.querySelector("btn-tambah");
kurang.onClick = function () {
    let input1 = parseInt(document.getElementById("1").value);
    let input2 = parseInt(document.getElementById("2").value);

    document.getElementById("hasil").innerHTML = input1 - input2;
}