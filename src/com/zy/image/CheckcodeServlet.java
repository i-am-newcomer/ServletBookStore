package com.zy.image;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CheckcodeServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//设置响应返回类型
		response.setContentType("image/jpeg");
		//设置编码方式
		response.setCharacterEncoding("utf-8");
		//设置不缓存图片
		response.setHeader("Cache-Control", "no-cache");
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Expire", "0");
		
		//定义图片宽度和高度
		int width=80;
		int height = 25;
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		//得到画笔
		Graphics g = image.getGraphics();
		//绘制填充矩形
		g.setColor(new Color(200, 200, 200));
		g.fillRect(0, 0, width, height);
		
		//生成随机数
		Random rd = new Random();
		int rdint = rd.nextInt(8999)+1000;
		String rdstr = String.valueOf(rdint);
		//将随机数保存在会话属性中
		HttpSession session = request.getSession();
		session.setAttribute("checkcode", rdstr);
		
		//画随机数
		g.setColor(Color.BLUE);
		g.setFont(new Font("",Font.PLAIN, 22));
		g.drawString(rdstr, 15, 24);
		
		//画100个随机点
		g.setColor(Color.green);
		for(int i=0; i<100; i++) {
			int x = rd.nextInt(width);
			int y = rd.nextInt(height);
			g.drawOval(x, y, 1, 1);
		}
		
		//输出图片
		ImageIO.write(image, "jpeg", response.getOutputStream());
		
		g.dispose();
		
	}
}
