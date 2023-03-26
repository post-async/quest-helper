/*
 * Copyright (c) 2023, Zoinkwiz <https://github.com/Zoinkwiz>
 * Copyright (c) 2018 Abex
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.questhelper.steps.playermadesteps;


import net.runelite.api.Client;
import net.runelite.api.FontID;
import net.runelite.api.widgets.JavaScriptCallback;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetModelType;
import net.runelite.api.widgets.WidgetPositionMode;
import net.runelite.api.widgets.WidgetSizeMode;
import net.runelite.api.widgets.WidgetTextAlignment;
import net.runelite.api.widgets.WidgetType;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.game.chatbox.ChatboxPanelManager;

public class PlayerChatBox extends ChatBox
{
	protected PlayerChatBox(Client client, ChatboxPanelManager chatboxPanelManager, ClientThread clientThread)
	{
		super(client, chatboxPanelManager, clientThread);
	}

	@Override
	protected void open()
	{
		Widget container = chatboxPanelManager.getContainerWidget();

		int WRAPPER_HEIGHT_ADJUSTMENT = 17;
		int WRAPPER_WIDTH_ADJUSTMENT = 12;

		// 12 -> 5
		// 19 -> 10

		Widget npcFaceWidget = container.createChild(0, WidgetType.RECTANGLE);
		npcFaceWidget.setType(WidgetType.MODEL);
		npcFaceWidget.setModelId(dialog.getFaceID());
		npcFaceWidget.setAnimationId(dialog.getAnimation());
		npcFaceWidget.setRotationX(40);
		npcFaceWidget.setRotationZ(1882);
		npcFaceWidget.setModelZoom(796);
		npcFaceWidget.setOriginalX(46);
		npcFaceWidget.setOriginalY(53);
		npcFaceWidget.setOriginalWidth(32);
		npcFaceWidget.setOriginalHeight(32);
		npcFaceWidget.setXPositionMode(WidgetPositionMode.ABSOLUTE_TOP);
		npcFaceWidget.setYPositionMode(WidgetPositionMode.ABSOLUTE_TOP);
		npcFaceWidget.setModelType(WidgetModelType.LOCAL_PLAYER_CHATHEAD);
		npcFaceWidget.revalidate();

		Widget nameWidget = container.createChild(-1, WidgetType.TEXT);
		nameWidget.setText(dialog.getName());
		nameWidget.setTextColor(0x800000);
		nameWidget.setFontId(FontID.QUILL_8);
		nameWidget.setXPositionMode(WidgetPositionMode.ABSOLUTE_TOP);
		nameWidget.setOriginalX(WRAPPER_WIDTH_ADJUSTMENT + 96);
		nameWidget.setYPositionMode(WidgetPositionMode.ABSOLUTE_TOP);
		nameWidget.setOriginalY(WRAPPER_HEIGHT_ADJUSTMENT);
		nameWidget.setOriginalWidth(380);
		nameWidget.setOriginalHeight(17);
		nameWidget.setXTextAlignment(WidgetTextAlignment.CENTER);
		nameWidget.setYTextAlignment(WidgetTextAlignment.CENTER);
		nameWidget.setWidthMode(WidgetSizeMode.ABSOLUTE);
		nameWidget.revalidate();

		Widget continueWidget = container.createChild(-1, WidgetType.TEXT);
		continueWidget.setText("Click here to continue");
		continueWidget.setTextColor(0xff);
		continueWidget.setFontId(FontID.QUILL_8);
		continueWidget.setXPositionMode(WidgetPositionMode.ABSOLUTE_TOP);
		continueWidget.setOriginalX(WRAPPER_WIDTH_ADJUSTMENT + 96);
		continueWidget.setYPositionMode(WidgetPositionMode.ABSOLUTE_TOP);
		continueWidget.setOriginalY(WRAPPER_HEIGHT_ADJUSTMENT + 80);
		continueWidget.setOriginalWidth(380);
		continueWidget.setOriginalHeight(17);
		continueWidget.setXTextAlignment(WidgetTextAlignment.CENTER);
		continueWidget.setYTextAlignment(WidgetTextAlignment.CENTER);
		continueWidget.setWidthMode(WidgetSizeMode.ABSOLUTE);
		continueWidget.setAction(0, "Continue");
		continueWidget.setOnOpListener((JavaScriptCallback) ev -> {
			continueWidget.setText("Please wait...");
			continueChat();
		});
		continueWidget.setOnMouseOverListener((JavaScriptCallback) ev -> continueWidget.setTextColor(0xFFFFFF));
		continueWidget.setOnMouseLeaveListener((JavaScriptCallback) ev -> continueWidget.setTextColor(0xff));
		continueWidget.setHasListener(true);
		continueWidget.revalidate();

		continueW = continueWidget;

		Widget dialogWidget = container.createChild(-1, WidgetType.TEXT);
		dialogWidget.setText(dialog.getText());
		dialogWidget.setTextColor(0x0);
		dialogWidget.setFontId(FontID.QUILL_8);
		dialogWidget.setXPositionMode(WidgetPositionMode.ABSOLUTE_TOP);
		dialogWidget.setOriginalX(WRAPPER_WIDTH_ADJUSTMENT + 96);
		dialogWidget.setYPositionMode(WidgetPositionMode.ABSOLUTE_TOP);
		dialogWidget.setOriginalY(WRAPPER_HEIGHT_ADJUSTMENT + 16);
		dialogWidget.setOriginalWidth(380);
		dialogWidget.setOriginalHeight(67);
		dialogWidget.setXTextAlignment(WidgetTextAlignment.CENTER);
		dialogWidget.setYTextAlignment(WidgetTextAlignment.CENTER);
		dialogWidget.setWidthMode(WidgetSizeMode.ABSOLUTE);
		dialogWidget.revalidate();
	}

}
