package com.idinoproject.web.QRCode;

import java.io.OutputStream;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.AbstractView;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class QRCodeView extends AbstractView{
	public QRCodeView() {
        setContentType("image/png; charset=UTF-8");
	}

	@Override
	 protected void renderMergedOutputModel(Map<String, Object> model, 
		HttpServletRequest req, HttpServletResponse res) throws Exception{
	 
		res.setContentType(getContentType());
        res.setHeader("Content-Transfer-Encoding", "binary");
          
        OutputStream out = res.getOutputStream();
          
        QRCodeWriter qrCodeWriter = new QRCodeWriter();        // QR �ڵ�
        MultiFormatWriter barcode = new MultiFormatWriter();    // ���ڵ�
           
        String text = (String)model.get("content");
        text = new String(text.getBytes("UTF-8"), "ISO-8859-1");
        BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, 300, 300);
        /*BitMatrix bitMatrix = barcode.encode(text, BarcodeFormat.CODE_128, 100, 100);*/
       
        MatrixToImageWriter.writeToStream(bitMatrix, "png", out);
           
        out.flush();
	 }
}
