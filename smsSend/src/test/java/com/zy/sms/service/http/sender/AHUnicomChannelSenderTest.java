/**********************************************************************************************************************
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.                                       *
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.                        *
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.                                                   *
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.                     *
 * Vestibulum commodo. Ut rhoncus gravida arcu.                                                                       *
 **********************************************************************************************************************/

package com.zy.sms.service.http.sender;

import com.zy.sms.service.data.IDataManipulation;
import com.zy.sms.vo.SmsSendDataInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/*********************************************************************************************
 * <pre>
 *     FileName: com.zy.sms.service.http.sender.AHUnicomChannelSenderTest
 *         Desc:
 *       author: Z_Z.W - myhongkongzhen@gmail.com
 *      version: 2015-11-05 16:44
 *   LastChange: 2015-11-05 16:44
 *      History:
 * </pre>
 *********************************************************************************************/
@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( locations = { "classpath:spring/spring.xml" } )
public class AHUnicomChannelSenderTest
{

	private IDataManipulation<SmsSendDataInfo> aHUnicomChannelSender;

	@Test
	public void testOperating() throws Exception
	{
		try
		{
//			for ( int i = 0 ; i < 3000 ; i++ )
			{
				SmsSendDataInfo smsSendDataInfo = new SmsSendDataInfo();
				smsSendDataInfo.setContent( "您好：您的注册码是 " + ( ( long ) ( Math.random() * 10000 ) ) + "【云之訊】" );
				smsSendDataInfo.setMobile( "15098648522" );
				aHUnicomChannelSender.operating( smsSendDataInfo );
			}
		}
		catch ( Exception e )
		{
			e.printStackTrace();
		}
		finally
		{
			Thread.sleep( 300000 );
		}
	}

	public IDataManipulation<SmsSendDataInfo> getaHUnicomChannelSender()
	{
		return aHUnicomChannelSender;
	}

	@Resource( name = "aHUnicomChannelSender" )
	public void setaHUnicomChannelSender( IDataManipulation<SmsSendDataInfo> aHUnicomChannelSender )
	{
		this.aHUnicomChannelSender = aHUnicomChannelSender;
	}
}
