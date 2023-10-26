/*
 * Copyright (c) 2023, Zoinkwiz <https://github.com/Zoinkwiz>
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
package com.questhelper.runeliteobjects.extendedruneliteobjects;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum FaceAnimationIDs
{
	ASKING(554), // Refactor NORMAL(554),
	ASKING_2(555),
	THINKING(556), // Could also be ASKING_3
	THINKING_2(557), // Could also be ASKING_4
	GUILT(562),
	GUILT_2(563),
	GUILT_3(564),
	GUILT_4(565),
	HESITANT(566),
	HAPPY(567), // Refactor FRIENDLY(567),
	HAPPY_2(568), // Refactor YES(568),
	QUIZZICAL(569),
	HAPPY_3(570), // Refactor CHATTY(570),
	EXTREMELY_SHOCKED(571),
	EXTREMELY_SHOCKED_2(572),
	EXTREMELY_SHOCKED_3(573),
	GUILT_5(574),
	SUSPICIOUS(575), // Refactor QUESTIONING(575),
	SUSPICIOUS_2(576),
	SUSPICIOUS_3(577),
	SUSPICIOUS_4(578),
	SUSPICIOUS_NO_TALKING(579),
	NEUTRAL(588), // Refactor FRIENDLY_QUESTIONING(588),
	NEUTRAL_2(589), // Refactor FRIENDLY_2(589),
	NEUTRAL_3(590),
	NEUTRAL_4(591),
	ANNOYED(592),
	ANNOYED_1(593),
	ANNOYED_2(594),
	ANNOYED_3(595),
	SCARED(596),
	SCARED_2(597),
	SCARED_3(598),
	SCARED_4(599),
	CRYING(600),
	CRYING_2(601),
	CRYING_3(602),
	CRYING_4(603),
	MAD_NO_TALKING(604),
	JOLLY(605), // Refactor SHORT_LAUGH(605),
	JOLLY_2(606), // Refactor LAUGHING(606),
	JOLLY_3(607), // Refactor LAUGHING(607),
	JOLLY_4(608),
	EVIL_LAUGHING(609),
	AFRAID(610), // Refactor SAD(610),
	AFRAID_2(611),
	AFRAID_3(612),
	WORRIED_SAD(612),
	CRYING_5(613),
	ANGRY(614), // Refactor ANNOYED(614),
	ANGRY_2(615), // Refactor ANNOYED_2(615);
	ANGRY_3(616),
	ANGRY_4(617),
	DIZZY(1637),
	PANICKED(1854), // Bugged encoder (jagex bug? this may crash clients if no explicit check is in place)
	DRUNK(1991),
	TOOTH_PULLED(2674),
	SLEEPING_UNCONSCIOUS(3321),
	CRYSTAL_ENCHANTING(3510),
	CRYSTAL_ENCHANTING_1(3511),
	CRYSTAL_ENCHANTING_2(3512),
	CRYSTAL_ENCHANTING_3(3513),
	CRYSTAL_ENCHANTING_4(3514),
	NOPERS(3515),
	NOPERS_2(3516),
	NOPERS_3(3517),
	NOPERS_4(3518),
	SLEEPING_UNCONSCIOUS_2(3519),
	SLEEPING_UNCONSCIOUS_3(3520),
	SLEEPING_UNCONSCIOUS_4(3521),
	SLEEPING_UNCONSCIOUS_5(3522),
	OH_HUH(4221),
	SLEEPING_UNCONSCIOUS_6(4587),
	SLEEPING_UNCONSCIOUS_7(4588),
	SLEEPING_UNCONSCIOUS_8(4589),
	SLEEPING_UNCONSCIOUS_9(4590),
	FURIOUS(8542),
	FURIOUS_2(8543),
	FURIOUS_NO_TALKING(8544),
	HAIRDRESSER_PREVIEW(10057);

	@Getter
	private final int animationID;
}
