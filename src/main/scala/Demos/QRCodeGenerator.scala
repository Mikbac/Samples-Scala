package Demos

import java.nio.file.Paths

import com.google.zxing.client.j2se.MatrixToImageWriter
import com.google.zxing.common.BitMatrix
import com.google.zxing.{BarcodeFormat, MultiFormatWriter}

/**
 * Created by MikBac on 30.08.2020
 */
object QRCodeGenerator {

  def createQRCode(data: String,
                   path: String,
                   charset: String,
                   height: Int,
                   width: Int): Unit = {

    val matrix: BitMatrix
    = new MultiFormatWriter().encode(
      new String(
        data.getBytes(charset),
        charset),
      BarcodeFormat.QR_CODE, width, height);

    MatrixToImageWriter
      .writeToPath(
        matrix,
        path.substring(
          path.lastIndexOf('.') + 1),
        Paths get path)

  }

  def main(args: Array[String]): Unit = {

    val data = "XYZ/XYZ"
    val file = "./fileName.jpg"
    val charset = "UTF-8";

    createQRCode(data, file, charset,
      200, 200);

  }

}
