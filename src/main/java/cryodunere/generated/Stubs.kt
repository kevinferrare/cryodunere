package cryodunere.generated

import spice86.emulator.memory.SegmentedAddress
import spice86.emulator.function.FunctionInformation
import spice86.emulator.machine.Machine
import spice86.emulator.reverseengineer.JavaOverrideHelper
import java.lang.Runnable

// Stubs for overrides
open class Stubs(
  functionInformations: MutableMap<SegmentedAddress, FunctionInformation>,
  prefix: String,
  machine: Machine
) : JavaOverrideHelper(functionInformations, prefix, machine) {

  // Not providing stub for entry. Reason: Function has no return

  // defineFunction(0x1ED, 0x83, "unknown") { unknown_01ED_0083_1F53() }
  fun unknown_01ED_0083_1F53(): Runnable {
    // display.setVideoBufferSegmentDBD6/set_frontbuffer_as_active_framebuffer_ida_01ED_C07C_DF4C();
    // ida.gfx_call_bp_with_front_buffer_as_screen_ida_01ED_C097_DF67();
    // display.clearCurrentVideoBuffer/gfx_clear_frame_buffer_ida_01ED_C0AD_DF7D();
    // ida.load_icons_sprites_ida_01ED_C137_E007();
    // ida.draw_sprite_ida_01ED_C22F_E0FF();
    // ida.check_amr_or_eng_language_ida_01ED_CFA0_EE70();

    return nearRet()
  }

  // Not providing stub for datastructures.convertIndexTableToPointerTable/adjust_sub_resource_pointers_ida. Reason: Function already has an override

  // defineFunction(0x1ED, 0xB0, "initialize_2_ida") { initialize_2_ida_01ED_00B0_1F80() }
  fun initialize_2_ida_01ED_00B0_1F80(): Runnable {
    // ida.intialize_resources_ida_01ED_00D1_1FA1();
    // ida.map2_resource_func_ida_01ED_0169_2039();
    // unknown_01ED_B17A_D04A();
    // initRelated.vgaInitRelated_01ED_DA53_F923();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD1, "intialize_resources_ida") { intialize_resources_ida_01ED_00D1_1FA1() }
  fun intialize_resources_ida_01ED_00D1_1FA1(): Runnable {
    // datastructures.convertIndexTableToPointerTable/adjust_sub_resource_pointers_ida_01ED_0098_1F68();
    // unknown_01ED_CFB9_EE89();
    // ida.open_resource_force_hsq_ida_01ED_F0A0_0F70();
    // ida.open_resource_by_index_si_ida_01ED_F0B9_0F89();
    // ida.bump_allocate_bump_cx_bytes_ida_01ED_F0FF_0FCF();
    // vgaDriver.noOp_2538_013C_54BC();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x169, "map2_resource_func_ida") { map2_resource_func_ida_01ED_0169_2039() }
  fun map2_resource_func_ida_01ED_0169_2039(): Runnable {
    // unknown_01ED_6603_84D3();
    // unknown_01ED_B5C5_D495();
    // ida.open_sprite_sheet_ida_01ED_C13E_E00E();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x1E0, "unknown") { unknown_01ED_01E0_20B0() }
  fun unknown_01ED_01E0_20B0(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x21C, "play_intro2_ida") { play_intro2_ida_01ED_021C_20EC() }
  fun play_intro2_ida_01ED_021C_20EC(): Runnable {
    // datastructures.convertIndexTableToPointerTable/adjust_sub_resource_pointers_ida_01ED_0098_1F68();
    // unknown_01ED_0911_27E1();
    // ida.calc_SAL_index_ida_01ED_5E4F_7D1F();
    // unknown_01ED_AB4F_CA1F();
    // ida.pcm_stop_voc_q_ida_01ED_AC14_CAE4();
    // unknown_01ED_AD50_CC20();
    // unknown_01ED_ADE0_CCB0();
    // unknown_01ED_ADED_CCBD();
    // unknown_01ED_C102_DFD2();
    // unknown_01ED_DDB0_FC80();
    // unknown_01ED_DE54_FD24();
    // ida.open_resource_by_index_si_ida_01ED_F0B9_0F89();
    // vgaDriver.fillWithZeroFor64000AtES_2538_0118_5498();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x2C1, "unknown") { unknown_01ED_02C1_2191() }
  fun unknown_01ED_02C1_2191(): Runnable {
    // unknown_01ED_02DE_21AE();
    // unknown_01ED_02E3_21B3();
    // unknown_01ED_88AF_A77F();
    // display.set479ETo0_01ED_9901_B7D1();
    // display.clearCurrentVideoBuffer/gfx_clear_frame_buffer_ida_01ED_C0AD_DF7D();
    // display.setFontToIntro_01ED_D068_EF38();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x2DE, "unknown") { unknown_01ED_02DE_21AE() }
  fun unknown_01ED_02DE_21AE(): Runnable {
    // mainCode.memCopy8Bytes_01ED_5BA8_7A78();
    // display.setVideoBufferSegmentDBD6/set_frontbuffer_as_active_framebuffer_ida_01ED_C07C_DF4C();
    // ida.open_sprite_sheet_ida_01ED_C13E_E00E();
    // unknown_01ED_C305_E1D5();
    // unknown_01ED_C30D_E1DD();
    // unknown_01ED_C343_E213();
    // unknown_01ED_C432_E302();
    // vgaDriver.copySquareOfPixels_2538_0130_54B0();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x2E0, "unknown") { unknown_01ED_02E0_21B0() }
  fun unknown_01ED_02E0_21B0(): Runnable {
    // mainCode.memCopy8Bytes_01ED_5BA8_7A78();
    // display.setVideoBufferSegmentDBD6/set_frontbuffer_as_active_framebuffer_ida_01ED_C07C_DF4C();
    // ida.open_sprite_sheet_ida_01ED_C13E_E00E();
    // unknown_01ED_C305_E1D5();
    // unknown_01ED_C30D_E1DD();
    // unknown_01ED_C343_E213();
    // unknown_01ED_C432_E302();
    // vgaDriver.copySquareOfPixels_2538_0130_54B0();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x2E3, "unknown") { unknown_01ED_02E3_21B3() }
  fun unknown_01ED_02E3_21B3(): Runnable {
    // unknown_01ED_02E0_21B0();
    // unknown_01ED_B85A_D72A();
    // unknown_01ED_B8A7_D777();
    // ida.open_sprite_sheet_ida_01ED_C13E_E00E();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x309, "play_CREDITS_HNM_ida") { play_CREDITS_HNM_ida_01ED_0309_21D9() }
  fun play_CREDITS_HNM_ida_01ED_0309_21D9(): Runnable {
    // display.clearVgaOffset01A3F/clear_global_y_offset_ida_01ED_0579_2449();
    // unknown_01ED_0A16_28E6();
    // unknown_01ED_AD50_CC20();
    // display.setVideoBufferSegmentDBD6/set_frontbuffer_as_active_framebuffer_ida_01ED_C07C_DF4C();
    // display.clearCurrentVideoBuffer/gfx_clear_frame_buffer_ida_01ED_C0AD_DF7D();
    // unknown_01ED_C102_DFD2();
    // video.isLastFrame/check_if_hnm_complete_ida_01ED_CC85_EB55();
    // ida.stc_on_user_input_ida_01ED_DD63_FC33();
    // mainCode.setCEE8To0_01ED_DE4E_FD1E();
    // vgaDriver.updateVgaOffset01A3FromLineNumberAsAx_2538_0163_54E3();

    return nearRet()
  }

  // Not providing stub for display.clearVgaOffset01A3F/clear_global_y_offset_ida. Reason: Function already has an override

  // defineFunction(0x1ED, 0x580, "play_intro_ida") { play_intro_ida_01ED_0580_2450() }
  fun play_intro_ida_01ED_0580_2450(): Runnable {
    // display.clearVgaOffset01A3F/clear_global_y_offset_ida_01ED_0579_2449();
    // unknown_01ED_0911_27E1();
    // scriptedScene.loadAXFromCSUnknownOffset4854AndAdvanceSIAndOffset/intro_script_load_word_ida_01ED_093F_280F();
    // scriptedScene.setUnknownOffset4854ToSi/intro_script_set_offset_ida_01ED_0945_2815();
    // unknown_01ED_39E6_58B6();
    // unknown_01ED_3A7C_594C();
    // unknown_01ED_9985_B855();
    // sound.checkSoundPresent/midi_func_2_0_ida_01ED_AEB7_CD87();
    // display.setVideoBufferSegmentDBD6/set_frontbuffer_as_active_framebuffer_ida_01ED_C07C_DF4C();
    // ida.gfx_call_bp_with_front_buffer_as_screen_ida_01ED_C097_DF67();
    // unknown_01ED_C0F4_DFC4();
    // ida.transition_ida_01ED_C108_DFD8();
    // ida.hnm_close_resource_ida_01ED_CA01_E8D1();
    // ida.stc_on_user_input_ida_01ED_DD63_FC33();
    // ida.check_midi_ida_01ED_DE0C_FCDC();
    // unknown_01ED_DE54_FD24();
    // vgaDriver.fillWithZeroFor64000AtES_2538_0118_5498();
    // vgaDriver.updateVgaOffset01A3FromLineNumberAsAx_2538_0163_54E3();
    // vgaDriver.copyPalette2toPalette1_2538_017B_54FB();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x61C, "load_VIRGIN_HNM_ida") { load_VIRGIN_HNM_ida_01ED_061C_24EC() }
  fun load_VIRGIN_HNM_ida_01ED_061C_24EC(): Runnable {
    // ida.decode_sd_block_ida_01ED_AA0F_C8DF();
    // ida.play_music_MORNING_HSQ_ida_01ED_AD57_CC27();
    // ida.hnm_reset_and_read_header_ida_01ED_C92B_E7FB();
    // unknown_01ED_CB1A_E9EA();
    // ida.hnm_decode_video_frame_ida_01ED_CC96_EB66();
    // unknown_01ED_CCF4_EBC4();
    // ida.hnm_prepare_header_read_ida_01ED_CDA0_EC70();
    // ida.hnm_reset_ida_01ED_CE1A_ECEA();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x911, "unknown") { unknown_01ED_0911_27E1() }
  fun unknown_01ED_0911_27E1(): Runnable {
    // unknown_01ED_0A3E_290E();
    // unknown_01ED_0B21_29F1();
    // unknown_01ED_39E6_58B6();
    // unknown_01ED_98E6_B7B6();
    // unknown_01ED_9985_B855();
    // unknown_01ED_B930_D800();
    // unknown_01ED_DA5F_F92F();

    return nearRet()
  }

  // Not providing stub for scriptedScene.loadAXFromCSUnknownOffset4854AndAdvanceSIAndOffset/intro_script_load_word_ida. Reason: Function already has an override

  // Not providing stub for scriptedScene.setUnknownOffset4854ToSi/intro_script_set_offset_ida. Reason: Function already has an override

  // defineFunction(0x1ED, 0x9EF, "play_CREDITS_HNM_ida") { play_CREDITS_HNM_ida_01ED_09EF_28BF() }
  fun play_CREDITS_HNM_ida_01ED_09EF_28BF(): Runnable {
    // ida.decode_sd_block_ida_01ED_AA0F_C8DF();
    // ida.hnm_reset_and_read_header_ida_01ED_C92B_E7FB();
    // ida.hnm_decode_video_frame_ida_01ED_CC96_EB66();
    // unknown_01ED_CCF4_EBC4();
    // ida.hnm_prepare_header_read_ida_01ED_CDA0_EC70();
    // ida.hnm_reset_ida_01ED_CE1A_ECEA();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xA16, "unknown") { unknown_01ED_0A16_28E6() }
  fun unknown_01ED_0A16_28E6(): Runnable {
    // unknown_01ED_0A23_28F3();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xA23, "unknown") { unknown_01ED_0A23_28F3() }
  fun unknown_01ED_0A23_28F3(): Runnable {
    // display.setTextVideoBufferSegmentDBD8/set_screen_as_active_framebuffer_ida_01ED_C08E_DF5E();
    // unknown_01ED_CAA0_E970();
    // unknown_01ED_CAD4_E9A4();
    // unknown_01ED_CB1A_E9EA();
    // unknown_01ED_CC4E_EB1E();
    // ida.hnm_decode_video_frame_ida_01ED_CC96_EB66();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xA3E, "unknown") { unknown_01ED_0A3E_290E() }
  fun unknown_01ED_0A3E_290E(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB21, "unknown") { unknown_01ED_0B21_29F1() }
  fun unknown_01ED_0B21_29F1(): Runnable {
    // sound.soundDriverUnknownClearAL/call_pcm_audio_vtable_func_5_ida_01ED_AC30_CB00();
    // unknown_01ED_DA5F_F92F();

    return nearRet()
  }

  // Not providing stub for mainCode.noOp. Reason: Function already has an override

  // defineFunction(0x1ED, 0xFD9, "unknown") { unknown_01ED_0FD9_2EA9() }
  fun unknown_01ED_0FD9_2EA9(): Runnable {
    // unknown_01ED_1B23_39F3();
    // mainCode.setUnknown2788To0_01ED_B2BE_D18E();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x100B, "unknown") { unknown_01ED_100B_2EDB() }
  fun unknown_01ED_100B_2EDB(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x1027, "unknown") { unknown_01ED_1027_2EF7() }
  fun unknown_01ED_1027_2EF7(): Runnable {
    // unknown_01ED_3EFE_5DCE();
    // ida.load_icons_sprites_ida_01ED_C137_E007();
    // unknown_01ED_D200_F0D0();
    // unknown_01ED_D741_F611();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x102F, "unknown") { unknown_01ED_102F_2EFF() }
  fun unknown_01ED_102F_2EFF(): Runnable {
    // unknown_01ED_AD5E_CC2E();
    // mainCode.inc2788_01ED_B2B9_D189();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x127C, "unknown") { unknown_01ED_127C_314C() }
  fun unknown_01ED_127C_314C(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x1392, "unknown") { unknown_01ED_1392_3262() }
  fun unknown_01ED_1392_3262(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x1399, "unknown") { unknown_01ED_1399_3269() }
  fun unknown_01ED_1399_3269(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x1707, "unknown") { unknown_01ED_1707_35D7() }
  fun unknown_01ED_1707_35D7(): Runnable {
    // mainCode.noOp_01ED_0F66_2E36();
    // unknown_01ED_1392_3262();
    // unknown_01ED_1399_3269();
    // unknown_01ED_1803_36D3();
    // unknown_01ED_189A_376A();
    // unknown_01ED_2DB1_4C81();
    // unknown_01ED_2EBF_4D8F();
    // unknown_01ED_3AF9_59C9();
    // unknown_01ED_88AF_A77F();
    // unknown_01ED_8C8A_AB5A();
    // unknown_01ED_91A0_B070();
    // unknown_01ED_94F3_B3C3();
    // unknown_01ED_978E_B65E();
    // unknown_01ED_9B8B_BA5B();
    // unknown_01ED_9EFD_BDCD();
    // unknown_01ED_9F40_BE10();
    // unknown_01ED_A0F1_BFC1();
    // unknown_01ED_A396_C266();
    // unknown_01ED_ADBE_CC8E();
    // mainCode.setUnknown2788To0_01ED_B2BE_D18E();
    // ida.gfx_call_bp_with_front_buffer_as_screen_ida_01ED_C097_DF67();
    // ida.load_icons_sprites_ida_01ED_C137_E007();
    // dialogues.initDialogue_01ED_C85B_E72B();
    // unknown_01ED_D1F2_F0C2();
    // unknown_01ED_D200_F0D0();
    // unknown_01ED_D6FE_F5CE();
    // unknown_01ED_DA5F_F92F();
    // ida.call_restore_cursor_ida_01ED_DBB2_FA82();
    // display.pushAll_01ED_E270_0140();
    // display.popAll_01ED_E283_0153();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x176B, "unknown") { unknown_01ED_176B_363B() }
  fun unknown_01ED_176B_363B(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x1797, "unknown") { unknown_01ED_1797_3667() }
  fun unknown_01ED_1797_3667(): Runnable {
    // ida.load_icons_sprites_ida_01ED_C137_E007();
    // unknown_01ED_C1AA_E07A();
    // ida.draw_sprite_ida_01ED_C22F_E0FF();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x17BE, "unknown") { unknown_01ED_17BE_368E() }
  fun unknown_01ED_17BE_368E(): Runnable {
    // unknown_01ED_1797_3667();
    // display.setVideoBufferSegmentDBD6/set_frontbuffer_as_active_framebuffer_ida_01ED_C07C_DF4C();
    // unknown_01ED_C446_E316();
    // vgaDriver.copySquareOfPixels_2538_0130_54B0();
    // unknown_2538_014E_54CE();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x17E6, "unknown") { unknown_01ED_17E6_36B6() }
  fun unknown_01ED_17E6_36B6(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x1803, "unknown") { unknown_01ED_1803_36D3() }
  fun unknown_01ED_1803_36D3(): Runnable {
    // unknown_01ED_181E_36EE();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x181E, "unknown") { unknown_01ED_181E_36EE() }
  fun unknown_01ED_181E_36EE(): Runnable {
    // unknown_01ED_17BE_368E();
    // unknown_01ED_E387_0257();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x1834, "unknown") { unknown_01ED_1834_3704() }
  fun unknown_01ED_1834_3704(): Runnable {
    // unknown_2538_014B_54CB();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x1843, "unknown") { unknown_01ED_1843_3713() }
  fun unknown_01ED_1843_3713(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x1860, "unknown") { unknown_01ED_1860_3730() }
  fun unknown_01ED_1860_3730(): Runnable {
    // unknown_01ED_1843_3713();
    // unknown_01ED_5ADF_79AF();
    // unknown_01ED_AE04_CCD4();
    // unknown_01ED_B930_D800();
    // display.setVideoBufferSegmentDBD6/set_frontbuffer_as_active_framebuffer_ida_01ED_C07C_DF4C();
    // ida.gfx_call_bp_with_front_buffer_as_screen_ida_01ED_C097_DF67();
    // ida.transition_ida_01ED_C108_DFD8();
    // unknown_01ED_D2BD_F18D();
    // map.initMapCursorTypeDC58To0_01ED_DAA3_F973();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x189A, "unknown") { unknown_01ED_189A_376A() }
  fun unknown_01ED_189A_376A(): Runnable {
    // unknown_01ED_AE04_CCD4();
    // display.setVideoBufferSegmentDBD6/set_frontbuffer_as_active_framebuffer_ida_01ED_C07C_DF4C();
    // ida.transition_ida_01ED_C108_DFD8();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x18BA, "unknown") { unknown_01ED_18BA_378A() }
  fun unknown_01ED_18BA_378A(): Runnable {
    // unknown_01ED_39E6_58B6();
    // mainCode.setUnknown11CATo1_01ED_4ACA_699A();
    // unknown_01ED_4D00_6BD0();
    // unknown_01ED_98E6_B7B6();
    // sound.soundDriverUnknownClearAL/call_pcm_audio_vtable_func_5_ida_01ED_AC30_CB00();
    // unknown_01ED_D2BD_F18D();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x1A0F, "unknown") { unknown_01ED_1A0F_38DF() }
  fun unknown_01ED_1A0F_38DF(): Runnable {
    // unknown_01ED_1A34_3904();
    // ida.load_icons_sprites_ida_01ED_C137_E007();
    // ida.open_sprite_sheet_ida_01ED_C13E_E00E();
    // ida.gfx_copy_rect_to_screen_ida_01ED_C4AA_E37A();
    // unknown_01ED_D200_F0D0();
    // ida.call_restore_cursor_ida_01ED_DBB2_FA82();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x1A34, "unknown") { unknown_01ED_1A34_3904() }
  fun unknown_01ED_1A34_3904(): Runnable {
    // unknown_01ED_1A9B_396B();
    // time.getSunlightDay_01ED_1AD1_39A1();
    // display.setTextVideoBufferSegmentDBD8/set_screen_as_active_framebuffer_ida_01ED_C08E_DF5E();
    // display.setFontToMenu_01ED_D075_EF45();
    // unknown_01ED_D12F_EFFF();
    // unknown_01ED_E290_0160();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x1A9B, "unknown") { unknown_01ED_1A9B_396B() }
  fun unknown_01ED_1A9B_396B(): Runnable {
    // datastructures.getEsSiPointerToUnknown_01ED_C1F4_E0C4();
    // unknown_2538_0112_5492();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x1AC5, "unknown") { unknown_01ED_1AC5_3995() }
  fun unknown_01ED_1AC5_3995(): Runnable {

    return nearRet()
  }

  // Not providing stub for time.getSunlightDay. Reason: Function already has an override

  // Not providing stub for time.setHourOfTheDayToAX. Reason: Function already has an override

  // defineFunction(0x1ED, 0x1AE7, "unknown") { unknown_01ED_1AE7_39B7() }
  fun unknown_01ED_1AE7_39B7(): Runnable {
    // mainCode.setBpToCurrentMenuTypeForScreenAction_01ED_D41B_F2EB();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x1B0D, "unknown") { unknown_01ED_1B0D_39DD() }
  fun unknown_01ED_1B0D_39DD(): Runnable {
    // unknown_01ED_1A0F_38DF();
    // time.setHourOfTheDayToAX_01ED_1AE0_39B0();
    // unknown_01ED_1BEC_3ABC();
    // unknown_01ED_1C18_3AE8();
    // unknown_01ED_1D9F_3C6F();
    // unknown_01ED_1DD3_3CA3();
    // unknown_01ED_1DD4_3CA4();
    // unknown_01ED_2B2A_49FA();
    // unknown_01ED_331E_51EE();
    // unknown_01ED_38E1_57B1();
    // ida.map_func_qq_ida_01ED_63F0_82C0();
    // unknown_01ED_6C6F_8B3F();
    // mainCode.isUnknownDC2BZero_01ED_ABCC_CA9C();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x1B23, "unknown") { unknown_01ED_1B23_39F3() }
  fun unknown_01ED_1B23_39F3(): Runnable {
    // unknown_01ED_1A0F_38DF();
    // time.setHourOfTheDayToAX_01ED_1AE0_39B0();
    // unknown_01ED_1BEC_3ABC();
    // unknown_01ED_1C18_3AE8();
    // unknown_01ED_1D9F_3C6F();
    // unknown_01ED_1DD7_3CA7();
    // unknown_01ED_331E_51EE();
    // unknown_01ED_38E1_57B1();
    // ida.map_func_qq_ida_01ED_63F0_82C0();
    // unknown_01ED_6C6F_8B3F();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x1BEC, "unknown") { unknown_01ED_1BEC_3ABC() }
  fun unknown_01ED_1BEC_3ABC(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x1C18, "unknown") { unknown_01ED_1C18_3AE8() }
  fun unknown_01ED_1C18_3AE8(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x1D9F, "unknown") { unknown_01ED_1D9F_3C6F() }
  fun unknown_01ED_1D9F_3C6F(): Runnable {
    // unknown_01ED_1E01_3CD1();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x1DD3, "unknown") { unknown_01ED_1DD3_3CA3() }
  fun unknown_01ED_1DD3_3CA3(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x1DD4, "unknown") { unknown_01ED_1DD4_3CA4() }
  fun unknown_01ED_1DD4_3CA4(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x1DD7, "unknown") { unknown_01ED_1DD7_3CA7() }
  fun unknown_01ED_1DD7_3CA7(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x1E01, "unknown") { unknown_01ED_1E01_3CD1() }
  fun unknown_01ED_1E01_3CD1(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x1EBE, "unknown") { unknown_01ED_1EBE_3D8E() }
  fun unknown_01ED_1EBE_3D8E(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x2170, "unknown") { unknown_01ED_2170_4040() }
  fun unknown_01ED_2170_4040(): Runnable {
    // display.pushAll_01ED_E270_0140();
    // display.popAll_01ED_E283_0153();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x2A51, "unknown") { unknown_01ED_2A51_4921() }
  fun unknown_01ED_2A51_4921(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x2AAF, "unknown") { unknown_01ED_2AAF_497F() }
  fun unknown_01ED_2AAF_497F(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x2B2A, "unknown") { unknown_01ED_2B2A_49FA() }
  fun unknown_01ED_2B2A_49FA(): Runnable {
    // mainCode.setBpToCurrentMenuTypeForScreenAction_01ED_D41B_F2EB();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x2D74, "open_SAL_resource_ida") { open_SAL_resource_ida_01ED_2D74_4C44() }
  fun open_SAL_resource_ida_01ED_2D74_4C44(): Runnable {
    // datastructures.convertIndexTableToPointerTable/adjust_sub_resource_pointers_ida_01ED_0098_1F68();
    // ida.calc_SAL_index_ida_01ED_5E4F_7D1F();
    // ida.open_resource_by_index_si_ida_01ED_F0B9_0F89();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x2DB1, "unknown") { unknown_01ED_2DB1_4C81() }
  fun unknown_01ED_2DB1_4C81(): Runnable {
    // unknown_01ED_1797_3667();
    // unknown_01ED_17BE_368E();
    // unknown_01ED_1834_3704();
    // ida.open_SAL_resource_ida_01ED_2D74_4C44();
    // unknown_01ED_35AD_547D();
    // unknown_01ED_37B2_5682();
    // mainCode.memCopy8BytesFrom1470ToD83C_01ED_5BA0_7A70();
    // unknown_01ED_AD5E_CC2E();
    // display.setVideoBufferSegmentDBD6/set_frontbuffer_as_active_framebuffer_ida_01ED_C07C_DF4C();
    // ida.gfx_call_bp_with_front_buffer_as_screen_ida_01ED_C097_DF67();
    // unknown_01ED_C0F4_DFC4();
    // unknown_01ED_C412_E2E2();
    // ida.gfx_copy_framebuf_to_screen_ida_01ED_C4CD_E39D();
    // map.setMapClickHandlerAddressToInGame_01ED_D95B_F82B();
    // unknown_01ED_E387_0257();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x2DBF, "unknown") { unknown_01ED_2DBF_4C8F() }
  fun unknown_01ED_2DBF_4C8F(): Runnable {
    // unknown_01ED_1797_3667();
    // unknown_01ED_1834_3704();
    // ida.open_SAL_resource_ida_01ED_2D74_4C44();
    // unknown_01ED_35AD_547D();
    // unknown_01ED_37B2_5682();
    // mainCode.memCopy8BytesFrom1470ToD83C_01ED_5BA0_7A70();
    // unknown_01ED_AD5E_CC2E();
    // display.setVideoBufferSegmentDBD6/set_frontbuffer_as_active_framebuffer_ida_01ED_C07C_DF4C();
    // ida.gfx_call_bp_with_front_buffer_as_screen_ida_01ED_C097_DF67();
    // unknown_01ED_C0F4_DFC4();
    // ida.gfx_copy_framebuf_to_screen_ida_01ED_C4CD_E39D();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x2E52, "unknown") { unknown_01ED_2E52_4D22() }
  fun unknown_01ED_2E52_4D22(): Runnable {
    // unknown_01ED_35AD_547D();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x2E98, "unknown") { unknown_01ED_2E98_4D68() }
  fun unknown_01ED_2E98_4D68(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x2EB2, "unknown") { unknown_01ED_2EB2_4D82() }
  fun unknown_01ED_2EB2_4D82(): Runnable {
    // mainCode.noOp_01ED_0F66_2E36();
    // unknown_01ED_2E98_4D68();
    // unknown_01ED_2EFB_4DCB();
    // unknown_01ED_2FFB_4ECB();
    // unknown_01ED_301A_4EEA();
    // unknown_01ED_3090_4F60();
    // unknown_01ED_9285_B155();
    // unknown_01ED_98E6_B7B6();
    // mainCode.setBpToCurrentMenuTypeForScreenAction_01ED_D41B_F2EB();
    // mainCode.dispatcherHelperDeterminesWhereToJump_01ED_D454_F324();
    // unknown_01ED_D48A_F35A();
    // unknown_01ED_D763_F633();
    // ida.call_restore_cursor_ida_01ED_DBB2_FA82();
    // ida.draw_mouse_ida_01ED_DBEC_FABC();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x2EBF, "unknown") { unknown_01ED_2EBF_4D8F() }
  fun unknown_01ED_2EBF_4D8F(): Runnable {
    // mainCode.dispatcherHelperDeterminesWhereToJump_01ED_D454_F324();
    // unknown_01ED_D48A_F35A();
    // ida.call_restore_cursor_ida_01ED_DBB2_FA82();
    // ida.draw_mouse_ida_01ED_DBEC_FABC();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x2EFB, "unknown") { unknown_01ED_2EFB_4DCB() }
  fun unknown_01ED_2EFB_4DCB(): Runnable {
    // unknown_01ED_7F27_9DF7();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x2FFB, "unknown") { unknown_01ED_2FFB_4ECB() }
  fun unknown_01ED_2FFB_4ECB(): Runnable {
    // unknown_01ED_3EFE_5DCE();
    // ida.load_icons_sprites_ida_01ED_C137_E007();
    // unknown_01ED_D200_F0D0();
    // unknown_01ED_D741_F611();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x301A, "unknown") { unknown_01ED_301A_4EEA() }
  fun unknown_01ED_301A_4EEA(): Runnable {
    // ida.load_icons_sprites_ida_01ED_C137_E007();
    // unknown_01ED_D200_F0D0();
    // unknown_01ED_D741_F611();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x3090, "unknown") { unknown_01ED_3090_4F60() }
  fun unknown_01ED_3090_4F60(): Runnable {
    // unknown_01ED_3127_4FF7();
    // unknown_01ED_36EE_55BE();
    // unknown_01ED_98E6_B7B6();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x3093, "unknown") { unknown_01ED_3093_4F63() }
  fun unknown_01ED_3093_4F63(): Runnable {
    // unknown_01ED_3127_4FF7();
    // unknown_01ED_36EE_55BE();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x30B9, "unknown") { unknown_01ED_30B9_4F89() }
  fun unknown_01ED_30B9_4F89(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x3120, "unknown") { unknown_01ED_3120_4FF0() }
  fun unknown_01ED_3120_4FF0(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x3127, "unknown") { unknown_01ED_3127_4FF7() }
  fun unknown_01ED_3127_4FF7(): Runnable {
    // unknown_01ED_331E_51EE();
    // unknown_01ED_6603_84D3();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x316E, "unknown") { unknown_01ED_316E_503E() }
  fun unknown_01ED_316E_503E(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x31F6, "unknown") { unknown_01ED_31F6_50C6() }
  fun unknown_01ED_31F6_50C6(): Runnable {
    // unknown_01ED_1AC5_3995();
    // unknown_01ED_329D_516D();
    // unknown_01ED_32C7_5197();
    // unknown_01ED_3310_51E0();
    // unknown_01ED_331E_51EE();
    // unknown_01ED_693B_880B();
    // unknown_01ED_6EFD_8DCD();
    // display.pushAll_01ED_E270_0140();
    // display.popAll_01ED_E283_0153();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x329D, "unknown") { unknown_01ED_329D_516D() }
  fun unknown_01ED_329D_516D(): Runnable {
    // unknown_01ED_6EFD_8DCD();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x32C7, "unknown") { unknown_01ED_32C7_5197() }
  fun unknown_01ED_32C7_5197(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x3310, "unknown") { unknown_01ED_3310_51E0() }
  fun unknown_01ED_3310_51E0(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x331E, "unknown") { unknown_01ED_331E_51EE() }
  fun unknown_01ED_331E_51EE(): Runnable {
    // unknown_01ED_3385_5255();
    // unknown_01ED_33BE_528E();
    // unknown_01ED_34A5_5375();
    // unknown_01ED_5274_7144();
    // unknown_01ED_7F27_9DF7();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x3385, "unknown") { unknown_01ED_3385_5255() }
  fun unknown_01ED_3385_5255(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x33BE, "unknown") { unknown_01ED_33BE_528E() }
  fun unknown_01ED_33BE_528E(): Runnable {
    // unknown_01ED_33D9_52A9();
    // unknown_01ED_6603_84D3();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x33D9, "unknown") { unknown_01ED_33D9_52A9() }
  fun unknown_01ED_33D9_52A9(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x3406, "unknown") { unknown_01ED_3406_52D6() }
  fun unknown_01ED_3406_52D6(): Runnable {
    // unknown_01ED_342D_52FD();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x342D, "unknown") { unknown_01ED_342D_52FD() }
  fun unknown_01ED_342D_52FD(): Runnable {
    // unknown_01ED_6EFD_8DCD();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x34A5, "unknown") { unknown_01ED_34A5_5375() }
  fun unknown_01ED_34A5_5375(): Runnable {
    // unknown_01ED_6639_8509();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x34D0, "unknown") { unknown_01ED_34D0_53A0() }
  fun unknown_01ED_34D0_53A0(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x3520, "unknown") { unknown_01ED_3520_53F0() }
  fun unknown_01ED_3520_53F0(): Runnable {
    // unknown_01ED_2A51_4921();
    // unknown_01ED_2AAF_497F();
    // unknown_01ED_93DF_B2AF();
    // unknown_01ED_96F1_B5C1();
    // unknown_01ED_D280_F150();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x35AD, "unknown") { unknown_01ED_35AD_547D() }
  fun unknown_01ED_35AD_547D(): Runnable {
    // unknown_01ED_3520_53F0();
    // unknown_01ED_4182_6052();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x36D3, "unknown") { unknown_01ED_36D3_55A3() }
  fun unknown_01ED_36D3_55A3(): Runnable {
    // unknown_01ED_36EE_55BE();
    // unknown_01ED_98B2_B782();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x36EE, "unknown") { unknown_01ED_36EE_55BE() }
  fun unknown_01ED_36EE_55BE(): Runnable {
    // unknown_01ED_30B9_4F89();
    // unknown_01ED_3120_4FF0();
    // unknown_01ED_3520_53F0();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x37B2, "unknown") { unknown_01ED_37B2_5682() }
  fun unknown_01ED_37B2_5682(): Runnable {
    // unknown_01ED_37EB_56BB();
    // unknown_01ED_395C_582C();
    // unknown_01ED_3971_5841();
    // unknown_01ED_398C_585C();
    // unknown_01ED_39E6_58B6();
    // unknown_01ED_3A95_5965();
    // unknown_01ED_3AA9_5979();
    // mainCode.fill47F8WithFF_01ED_3AE9_59B9();
    // ida.draw_SAL_ida_01ED_3B59_5A29();
    // unknown_01ED_3EFE_5DCE();
    // unknown_01ED_4988_6858();
    // unknown_01ED_4A5A_692A();
    // unknown_01ED_4D00_6BD0();
    // mainCode.memCopy8Bytes_01ED_5BA8_7A78();
    // unknown_01ED_98E6_B7B6();
    // ida.open_sprite_sheet_ida_01ED_C13E_E00E();
    // unknown_01ED_C432_E302();
    // ida.hnm_load_ida_01ED_CA1B_E8EB();
    // vgaDriver.copyPalette2toPalette1_2538_017B_54FB();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x37B5, "unknown") { unknown_01ED_37B5_5685() }
  fun unknown_01ED_37B5_5685(): Runnable {
    // unknown_01ED_39E6_58B6();
    // mainCode.fill47F8WithFF_01ED_3AE9_59B9();
    // ida.draw_SAL_ida_01ED_3B59_5A29();
    // unknown_01ED_3EFE_5DCE();
    // unknown_01ED_4D00_6BD0();
    // mainCode.memCopy8Bytes_01ED_5BA8_7A78();
    // unknown_01ED_C432_E302();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x37EB, "unknown") { unknown_01ED_37EB_56BB() }
  fun unknown_01ED_37EB_56BB(): Runnable {
    // unknown_01ED_380C_56DC();
    // unknown_01ED_4E12_6CE2();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x380C, "unknown") { unknown_01ED_380C_56DC() }
  fun unknown_01ED_380C_56DC(): Runnable {
    // unknown_01ED_388D_575D();
    // ida.calc_SAL_index_ida_01ED_5E4F_7D1F();
    // ida.open_sprite_sheet_ida_01ED_C13E_E00E();
    // ida.draw_sprite_ida_01ED_C22F_E0FF();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x388D, "unknown") { unknown_01ED_388D_575D() }
  fun unknown_01ED_388D_575D(): Runnable {
    // unknown_01ED_395C_582C();
    // unknown_01ED_3971_5841();
    // unknown_01ED_398C_585C();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x38B4, "unknown") { unknown_01ED_38B4_5784() }
  fun unknown_01ED_38B4_5784(): Runnable {
    // unknown_01ED_388D_575D();
    // ida.open_sprite_sheet_ida_01ED_C13E_E00E();
    // unknown_01ED_C2FD_E1CD();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x38E1, "unknown") { unknown_01ED_38E1_57B1() }
  fun unknown_01ED_38E1_57B1(): Runnable {
    // unknown_01ED_395C_582C();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x395C, "unknown") { unknown_01ED_395C_582C() }
  fun unknown_01ED_395C_582C(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x3971, "unknown") { unknown_01ED_3971_5841() }
  fun unknown_01ED_3971_5841(): Runnable {
    // ida.open_sprite_sheet_ida_01ED_C13E_E00E();
    // datastructures.getEsSiPointerToUnknown_01ED_C1F4_E0C4();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x398C, "unknown") { unknown_01ED_398C_585C() }
  fun unknown_01ED_398C_585C(): Runnable {
    // unknown_2538_0106_5486();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x39E6, "unknown") { unknown_01ED_39E6_58B6() }
  fun unknown_01ED_39E6_58B6(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x3A73, "unknown") { unknown_01ED_3A73_5943() }
  fun unknown_01ED_3A73_5943(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x3A7C, "unknown") { unknown_01ED_3A7C_594C() }
  fun unknown_01ED_3A7C_594C(): Runnable {
    // unknown_01ED_39E6_58B6();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x3A95, "unknown") { unknown_01ED_3A95_5965() }
  fun unknown_01ED_3A95_5965(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x3AA9, "unknown") { unknown_01ED_3AA9_5979() }
  fun unknown_01ED_3AA9_5979(): Runnable {
    // unknown_01ED_C305_E1D5();
    // unknown_2538_0112_5492();

    return nearRet()
  }

  // Not providing stub for mainCode.fill47F8WithFF. Reason: Function already has an override

  // defineFunction(0x1ED, 0x3AF9, "unknown") { unknown_01ED_3AF9_59C9() }
  fun unknown_01ED_3AF9_59C9(): Runnable {
    // unknown_01ED_37B5_5685();
    // vgaDriver.copySquareOfPixelsSiIsSourceSegment_2538_012A_54AA();
    // unknown_2538_016F_54EF();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x3B59, "draw_SAL_ida") { draw_SAL_ida_01ED_3B59_5A29() }
  fun draw_SAL_ida_01ED_3B59_5A29(): Runnable {
    // ida.SAL_polygon_ida_01ED_3BE9_5AB9();
    // unknown_01ED_3D2F_5BFF();
    // ida.do_weird_shit_with_stack_buffer_ida_01ED_3D83_5C53();
    // ida.open_sprite_sheet_ida_01ED_C13E_E00E();
    // ida.draw_sprite_ida_01ED_C22F_E0FF();
    // unknown_2538_0139_54B9();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x3BE9, "SAL_polygon_ida") { SAL_polygon_ida_01ED_3BE9_5AB9() }
  fun SAL_polygon_ida_01ED_3BE9_5AB9(): Runnable {
    // unknown_01ED_3E13_5CE3();
    // vgaDriver.generateTextureOutBP_2538_016C_54EC();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x3D2F, "unknown") { unknown_01ED_3D2F_5BFF() }
  fun unknown_01ED_3D2F_5BFF(): Runnable {
    // unknown_01ED_127C_314C();
    // unknown_01ED_9123_AFF3();
    // ida.open_sprite_sheet_ida_01ED_C13E_E00E();
    // unknown_01ED_C1AA_E07A();
    // ida.draw_sprite_ida_01ED_C22F_E0FF();
    // unknown_01ED_C2FD_E1CD();
    // ida.open_resource_by_index_si_ida_01ED_F0B9_0F89();
    // vgaDriver.noOp_2538_013C_54BC();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x3D83, "do_weird_shit_with_stack_buffer_ida") { do_weird_shit_with_stack_buffer_ida_01ED_3D83_5C53() }
  fun do_weird_shit_with_stack_buffer_ida_01ED_3D83_5C53(): Runnable {
    // unknown_01ED_3DF4_5CC4();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x3DF4, "unknown") { unknown_01ED_3DF4_5CC4() }
  fun unknown_01ED_3DF4_5CC4(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x3E13, "unknown") { unknown_01ED_3E13_5CE3() }
  fun unknown_01ED_3E13_5CE3(): Runnable {
    // unknown_01ED_3E80_5D50();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x3E80, "unknown") { unknown_01ED_3E80_5D50() }
  fun unknown_01ED_3E80_5D50(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x3EFE, "unknown") { unknown_01ED_3EFE_5DCE() }
  fun unknown_01ED_3EFE_5DCE(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x3F15, "unknown") { unknown_01ED_3F15_5DE5() }
  fun unknown_01ED_3F15_5DE5(): Runnable {
    // unknown_01ED_1797_3667();
    // unknown_01ED_1834_3704();
    // ida.open_SAL_resource_ida_01ED_2D74_4C44();
    // unknown_01ED_35AD_547D();
    // unknown_01ED_36D3_55A3();
    // unknown_01ED_37B2_5682();
    // unknown_01ED_3EFE_5DCE();
    // unknown_01ED_40C3_5F93();
    // mainCode.memCopy8BytesFrom1470ToD83C_01ED_5BA0_7A70();
    // unknown_01ED_A1C4_C094();
    // unknown_01ED_A1E2_C0B2();
    // unknown_01ED_A7A5_C675();
    // unknown_01ED_ABD5_CAA5();
    // sound.soundDriverUnknownClearAL/call_pcm_audio_vtable_func_5_ida_01ED_AC30_CB00();
    // unknown_01ED_AD5E_CC2E();
    // display.setVideoBufferSegmentDBD6/set_frontbuffer_as_active_framebuffer_ida_01ED_C07C_DF4C();
    // ida.gfx_call_bp_with_front_buffer_as_screen_ida_01ED_C097_DF67();
    // unknown_01ED_C0F4_DFC4();
    // unknown_01ED_C412_E2E2();
    // ida.gfx_copy_framebuf_to_screen_ida_01ED_C4CD_E39D();
    // unknown_01ED_D2BD_F18D();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x3F1F, "unknown") { unknown_01ED_3F1F_5DEF() }
  fun unknown_01ED_3F1F_5DEF(): Runnable {
    // unknown_01ED_1797_3667();
    // unknown_01ED_1834_3704();
    // ida.open_SAL_resource_ida_01ED_2D74_4C44();
    // unknown_01ED_35AD_547D();
    // unknown_01ED_36D3_55A3();
    // unknown_01ED_37B2_5682();
    // unknown_01ED_3EFE_5DCE();
    // unknown_01ED_40C3_5F93();
    // mainCode.memCopy8BytesFrom1470ToD83C_01ED_5BA0_7A70();
    // unknown_01ED_A1C4_C094();
    // unknown_01ED_A1E2_C0B2();
    // unknown_01ED_A7A5_C675();
    // unknown_01ED_ABD5_CAA5();
    // sound.soundDriverUnknownClearAL/call_pcm_audio_vtable_func_5_ida_01ED_AC30_CB00();
    // unknown_01ED_AD5E_CC2E();
    // unknown_01ED_AE04_CCD4();
    // display.setVideoBufferSegmentDBD6/set_frontbuffer_as_active_framebuffer_ida_01ED_C07C_DF4C();
    // ida.gfx_call_bp_with_front_buffer_as_screen_ida_01ED_C097_DF67();
    // unknown_01ED_C0F4_DFC4();
    // ida.transition_ida_01ED_C108_DFD8();
    // unknown_01ED_C412_E2E2();
    // ida.gfx_copy_framebuf_to_screen_ida_01ED_C4CD_E39D();
    // unknown_01ED_D2BD_F18D();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x3F24, "unknown") { unknown_01ED_3F24_5DF4() }
  fun unknown_01ED_3F24_5DF4(): Runnable {
    // unknown_01ED_1797_3667();
    // unknown_01ED_17BE_368E();
    // unknown_01ED_1834_3704();
    // ida.open_SAL_resource_ida_01ED_2D74_4C44();
    // unknown_01ED_35AD_547D();
    // unknown_01ED_36D3_55A3();
    // unknown_01ED_37B2_5682();
    // unknown_01ED_3EFE_5DCE();
    // unknown_01ED_40C3_5F93();
    // mainCode.memCopy8BytesFrom1470ToD83C_01ED_5BA0_7A70();
    // unknown_01ED_A1C4_C094();
    // unknown_01ED_A1E2_C0B2();
    // unknown_01ED_A7A5_C675();
    // unknown_01ED_ABD5_CAA5();
    // sound.soundDriverUnknownClearAL/call_pcm_audio_vtable_func_5_ida_01ED_AC30_CB00();
    // unknown_01ED_AD5E_CC2E();
    // display.setVideoBufferSegmentDBD6/set_frontbuffer_as_active_framebuffer_ida_01ED_C07C_DF4C();
    // ida.gfx_call_bp_with_front_buffer_as_screen_ida_01ED_C097_DF67();
    // unknown_01ED_C0F4_DFC4();
    // unknown_01ED_C412_E2E2();
    // ida.gfx_copy_framebuf_to_screen_ida_01ED_C4CD_E39D();
    // unknown_01ED_D2BD_F18D();
    // unknown_01ED_E387_0257();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x407E, "unknown") { unknown_01ED_407E_5F4E() }
  fun unknown_01ED_407E_5F4E(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x409A, "unknown") { unknown_01ED_409A_5F6A() }
  fun unknown_01ED_409A_5F6A(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x40AE, "unknown") { unknown_01ED_40AE_5F7E() }
  fun unknown_01ED_40AE_5F7E(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x40C3, "unknown") { unknown_01ED_40C3_5F93() }
  fun unknown_01ED_40C3_5F93(): Runnable {
    // unknown_01ED_40C9_5F99();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x40C9, "unknown") { unknown_01ED_40C9_5F99() }
  fun unknown_01ED_40C9_5F99(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x40D5, "unknown") { unknown_01ED_40D5_5FA5() }
  fun unknown_01ED_40D5_5FA5(): Runnable {
    // unknown_01ED_36D3_55A3();
    // mainCode.setUnknown11CATo0_01ED_4AC4_6994();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x4182, "unknown") { unknown_01ED_4182_6052() }
  fun unknown_01ED_4182_6052(): Runnable {
    // unknown_01ED_5D36_7C06();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x41C5, "unknown") { unknown_01ED_41C5_6095() }
  fun unknown_01ED_41C5_6095(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x41E1, "unknown") { unknown_01ED_41E1_60B1() }
  fun unknown_01ED_41E1_60B1(): Runnable {
    // unknown_01ED_B56C_D43C();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x425B, "unknown") { unknown_01ED_425B_612B() }
  fun unknown_01ED_425B_612B(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x439F, "unknown") { unknown_01ED_439F_626F() }
  fun unknown_01ED_439F_626F(): Runnable {
    // unknown_01ED_38B4_5784();
    // display.setVideoBufferSegmentDBD6/set_frontbuffer_as_active_framebuffer_ida_01ED_C07C_DF4C();
    // ida.open_sprite_sheet_ida_01ED_C13E_E00E();
    // unknown_01ED_C21B_E0EB();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x43E3, "unknown") { unknown_01ED_43E3_62B3() }
  fun unknown_01ED_43E3_62B3(): Runnable {
    // unknown_01ED_388D_575D();
    // unknown_01ED_C43E_E30E();
    // unknown_01ED_C4DD_E3AD();
    // unknown_2538_0160_54E0();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x4415, "unknown") { unknown_01ED_4415_62E5() }
  fun unknown_01ED_4415_62E5(): Runnable {
    // unknown_01ED_2FFB_4ECB();
    // unknown_01ED_43E3_62B3();
    // unknown_01ED_469B_656B();
    // mainCode.memCopy8BytesFrom1470ToD83C_01ED_5BA0_7A70();
    // unknown_01ED_C0F4_DFC4();
    // unknown_01ED_D717_F5E7();
    // map.setMapClickHandlerAddressToInGame_01ED_D95B_F82B();
    // unknown_01ED_DA5F_F92F();
    // map.initMapCursorTypeDC58To0_01ED_DAA3_F973();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x445D, "unknown") { unknown_01ED_445D_632D() }
  fun unknown_01ED_445D_632D(): Runnable {
    // unknown_01ED_407E_5F4E();
    // unknown_01ED_5B93_7A63();
    // unknown_01ED_62D6_81A6();
    // display.setTextVideoBufferSegmentDBD8/set_screen_as_active_framebuffer_ida_01ED_C08E_DF5E();
    // ida.load_icons_sprites_ida_01ED_C137_E007();
    // datastructures.getEsSiPointerToUnknown_01ED_C1F4_E0C4();
    // unknown_01ED_C30D_E1DD();
    // unknown_01ED_C4FB_E3CB();
    // unknown_01ED_DA25_F8F5();
    // unknown_01ED_DA5F_F92F();
    // unknown_01ED_DB74_FA44();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x44AB, "unknown") { unknown_01ED_44AB_637B() }
  fun unknown_01ED_44AB_637B(): Runnable {
    // unknown_01ED_5B93_7A63();
    // display.setTextVideoBufferSegmentDBD8/set_screen_as_active_framebuffer_ida_01ED_C08E_DF5E();
    // ida.load_icons_sprites_ida_01ED_C137_E007();
    // unknown_01ED_C30D_E1DD();
    // unknown_01ED_C4FB_E3CB();
    // unknown_01ED_DB74_FA44();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x450E, "unknown") { unknown_01ED_450E_63DE() }
  fun unknown_01ED_450E_63DE(): Runnable {
    // unknown_01ED_181E_36EE();
    // unknown_01ED_2DBF_4C8F();
    // unknown_01ED_38E1_57B1();
    // unknown_01ED_40D5_5FA5();
    // unknown_01ED_41C5_6095();
    // unknown_01ED_456C_643C();
    // unknown_01ED_4586_6456();
    // unknown_01ED_45DE_64AE();
    // unknown_01ED_4795_6665();
    // unknown_01ED_4944_6814();
    // unknown_01ED_4AB8_6988();
    // unknown_01ED_4B3B_6A0B();
    // unknown_01ED_4D00_6BD0();
    // ida.close_res_file_handle_ida_01ED_A9A1_C871();
    // unknown_01ED_AB45_CA15();
    // unknown_01ED_ABA9_CA79();
    // unknown_01ED_AD5E_CC2E();
    // unknown_01ED_C474_E344();
    // unknown_01ED_D2EA_F1BA();
    // unknown_01ED_DA5F_F92F();
    // unknown_01ED_E3A0_0270();
    // soundDriverPcSpeaker.clearAL_4822_0109_8329();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x456C, "unknown") { unknown_01ED_456C_643C() }
  fun unknown_01ED_456C_643C(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x4586, "unknown") { unknown_01ED_4586_6456() }
  fun unknown_01ED_4586_6456(): Runnable {
    // unknown_01ED_469B_656B();
    // unknown_01ED_514E_701E();
    // unknown_01ED_5D1D_7BED();
    // unknown_01ED_5E6D_7D3D();
    // unknown_01ED_629D_816D();
    // unknown_01ED_62A6_8176();
    // display.setTextVideoBufferSegmentDBD8/set_screen_as_active_framebuffer_ida_01ED_C08E_DF5E();
    // display.getCharacterCoordsXY_01ED_D05F_EF2F();
    // display.setFontToMenu_01ED_D075_EF45();
    // unknown_01ED_D12F_EFFF();
    // unknown_01ED_D194_F064();
    // ida.call_restore_cursor_ida_01ED_DBB2_FA82();
    // vgaDriver.drawMouseCursor_2538_0109_5489();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x45DE, "unknown") { unknown_01ED_45DE_64AE() }
  fun unknown_01ED_45DE_64AE(): Runnable {
    // unknown_01ED_4658_6528();
    // unknown_01ED_469B_656B();
    // unknown_01ED_629D_816D();
    // unknown_01ED_62A6_8176();
    // display.setTextVideoBufferSegmentDBD8/set_screen_as_active_framebuffer_ida_01ED_C08E_DF5E();
    // unknown_01ED_D04E_EF1E();
    // display.getCharacterCoordsXY_01ED_D05F_EF2F();
    // display.setFontToMenu_01ED_D075_EF45();
    // unknown_01ED_D12F_EFFF();
    // ida.call_restore_cursor_ida_01ED_DBB2_FA82();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x4658, "unknown") { unknown_01ED_4658_6528() }
  fun unknown_01ED_4658_6528(): Runnable {
    // unknown_01ED_CF70_EE40();
    // unknown_01ED_DA25_F8F5();
    // display.pushAll_01ED_E270_0140();
    // display.popAll_01ED_E283_0153();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x469B, "unknown") { unknown_01ED_469B_656B() }
  fun unknown_01ED_469B_656B(): Runnable {
    // unknown_01ED_DA5F_F92F();
    // display.pushAll_01ED_E270_0140();
    // display.popAll_01ED_E283_0153();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x46B5, "unknown") { unknown_01ED_46B5_6585() }
  fun unknown_01ED_46B5_6585(): Runnable {
    // display.setTextVideoBufferSegmentDBD8/set_screen_as_active_framebuffer_ida_01ED_C08E_DF5E();
    // unknown_01ED_D04E_EF1E();
    // display.getCharacterCoordsXY_01ED_D05F_EF2F();
    // display.setFontToMenu_01ED_D075_EF45();
    // unknown_01ED_D12F_EFFF();
    // unknown_01ED_DB67_FA37();
    // unknown_01ED_DB74_FA44();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x4795, "unknown") { unknown_01ED_4795_6665() }
  fun unknown_01ED_4795_6665(): Runnable {
    // unknown_01ED_181E_36EE();
    // unknown_01ED_37B2_5682();
    // mainCode.memCopy8BytesFrom1470ToD83C_01ED_5BA0_7A70();
    // ida.audio_start_voc_ida_01ED_AB15_C9E5();
    // sound.soundDriverUnknownClearAL/call_pcm_audio_vtable_func_5_ida_01ED_AC30_CB00();
    // unknown_01ED_AE04_CCD4();
    // display.setVideoBufferSegmentDBD6/set_frontbuffer_as_active_framebuffer_ida_01ED_C07C_DF4C();
    // unknown_01ED_C412_E2E2();
    // unknown_01ED_CE53_ED23();
    // unknown_01ED_E353_0223();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x4821, "unknown") { unknown_01ED_4821_66F1() }
  fun unknown_01ED_4821_66F1(): Runnable {
    // unknown_01ED_3A73_5943();
    // unknown_01ED_3A95_5965();
    // unknown_01ED_3AA9_5979();
    // sound.soundDriverUnknownClearAL/call_pcm_audio_vtable_func_5_ida_01ED_AC30_CB00();
    // display.setVideoBufferSegmentDBD6/set_frontbuffer_as_active_framebuffer_ida_01ED_C07C_DF4C();
    // unknown_01ED_C0F4_DFC4();
    // ida.open_sprite_sheet_ida_01ED_C13E_E00E();
    // unknown_01ED_C43E_E30E();
    // unknown_01ED_C4DD_E3AD();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x4944, "unknown") { unknown_01ED_4944_6814() }
  fun unknown_01ED_4944_6814(): Runnable {
    // unknown_01ED_50BE_6F8E();
    // unknown_01ED_5124_6FF4();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x4988, "unknown") { unknown_01ED_4988_6858() }
  fun unknown_01ED_4988_6858(): Runnable {
    // unknown_01ED_5B5D_7A2D();
    // unknown_01ED_5B69_7A39();
    // unknown_01ED_5B93_7A63();
    // mainCode.memCopy8BytesDsSIToDsDi_01ED_5B99_7A69();
    // unknown_01ED_5DCE_7C9E();
    // unknown_01ED_62C9_8199();
    // ida.map_func_ida_01ED_B6C3_D593();
    // display.setDialogueVideoBufferSegmentDC32/set_backbuffer_as_frame_buffer_ida_01ED_C085_DF55();
    // ida.load_icons_sprites_ida_01ED_C137_E007();
    // ida.draw_sprite_ida_01ED_C22F_E0FF();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x49EA, "unknown") { unknown_01ED_49EA_68BA() }
  fun unknown_01ED_49EA_68BA(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x4A00, "unknown") { unknown_01ED_4A00_68D0() }
  fun unknown_01ED_4A00_68D0(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x4A1A, "unknown") { unknown_01ED_4A1A_68EA() }
  fun unknown_01ED_4A1A_68EA(): Runnable {
    // unknown_01ED_DB74_FA44();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x4A5A, "unknown") { unknown_01ED_4A5A_692A() }
  fun unknown_01ED_4A5A_692A(): Runnable {
    // display.setDialogueVideoBufferSegmentDC32/set_backbuffer_as_frame_buffer_ida_01ED_C085_DF55();
    // ida.load_icons_sprites_ida_01ED_C137_E007();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x4AB8, "unknown") { unknown_01ED_4AB8_6988() }
  fun unknown_01ED_4AB8_6988(): Runnable {

    return nearRet()
  }

  // Not providing stub for mainCode.setUnknown11CATo0. Reason: Function already has an override

  // Not providing stub for mainCode.setUnknown11CATo1. Reason: Function already has an override

  // defineFunction(0x1ED, 0x4B2B, "unknown") { unknown_01ED_4B2B_69FB() }
  fun unknown_01ED_4B2B_69FB(): Runnable {
    // unknown_01ED_C46F_E33F();
    // vgaDriver.restoreImageUnderMouseCursor_2538_010C_548C();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x4B3B, "unknown") { unknown_01ED_4B3B_6A0B() }
  fun unknown_01ED_4B3B_6A0B(): Runnable {
    // unknown_01ED_0FD9_2EA9();
    // unknown_01ED_407E_5F4E();
    // unknown_01ED_40C3_5F93();
    // unknown_01ED_5206_70D6();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x4D00, "unknown") { unknown_01ED_4D00_6BD0() }
  fun unknown_01ED_4D00_6BD0(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x4E12, "unknown") { unknown_01ED_4E12_6CE2() }
  fun unknown_01ED_4E12_6CE2(): Runnable {
    // unknown_01ED_407E_5F4E();
    // unknown_01ED_409A_5F6A();
    // unknown_01ED_4EC6_6D96();
    // unknown_01ED_B532_D402();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x4EC6, "unknown") { unknown_01ED_4EC6_6D96() }
  fun unknown_01ED_4EC6_6D96(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x4F0C, "unknown") { unknown_01ED_4F0C_6DDC() }
  fun unknown_01ED_4F0C_6DDC(): Runnable {
    // unknown_01ED_2E52_4D22();
    // unknown_01ED_407E_5F4E();
    // unknown_01ED_41E1_60B1();
    // unknown_01ED_4A00_68D0();
    // unknown_01ED_4A1A_68EA();
    // unknown_01ED_4B3B_6A0B();
    // unknown_01ED_5206_70D6();
    // unknown_01ED_62D6_81A6();
    // unknown_01ED_B532_D402();
    // ida.map_func_ida_01ED_B58B_D45B();
    // display.setVideoBufferSegmentDBD6/set_frontbuffer_as_active_framebuffer_ida_01ED_C07C_DF4C();
    // display.setDialogueVideoBufferSegmentDC32/set_backbuffer_as_frame_buffer_ida_01ED_C085_DF55();
    // ida.load_icons_sprites_ida_01ED_C137_E007();
    // ida.draw_sprite_ida_01ED_C22F_E0FF();
    // ida.hnm_do_frame_ida_01ED_CA60_E930();
    // vgaDriver.drawMouseCursor_2538_0109_5489();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x503C, "unknown") { unknown_01ED_503C_6F0C() }
  fun unknown_01ED_503C_6F0C(): Runnable {
    // unknown_01ED_5D36_7C06();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x50BE, "unknown") { unknown_01ED_50BE_6F8E() }
  fun unknown_01ED_50BE_6F8E(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x5124, "unknown") { unknown_01ED_5124_6FF4() }
  fun unknown_01ED_5124_6FF4(): Runnable {
    // unknown_01ED_407E_5F4E();
    // unknown_01ED_5133_7003();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x5133, "unknown") { unknown_01ED_5133_7003() }
  fun unknown_01ED_5133_7003(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x514E, "unknown") { unknown_01ED_514E_701E() }
  fun unknown_01ED_514E_701E(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x5198, "unknown") { unknown_01ED_5198_7068() }
  fun unknown_01ED_5198_7068(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x51CB, "unknown") { unknown_01ED_51CB_709B() }
  fun unknown_01ED_51CB_709B(): Runnable {
    // unknown_01ED_5124_6FF4();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x5206, "unknown") { unknown_01ED_5206_70D6() }
  fun unknown_01ED_5206_70D6(): Runnable {
    // unknown_01ED_5198_7068();
    // unknown_01ED_51CB_709B();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x5274, "unknown") { unknown_01ED_5274_7144() }
  fun unknown_01ED_5274_7144(): Runnable {
    // unknown_01ED_5323_71F3();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x5323, "unknown") { unknown_01ED_5323_71F3() }
  fun unknown_01ED_5323_71F3(): Runnable {
    // unknown_01ED_5133_7003();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x58FA, "unknown") { unknown_01ED_58FA_77CA() }
  fun unknown_01ED_58FA_77CA(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x599F, "unknown") { unknown_01ED_599F_786F() }
  fun unknown_01ED_599F_786F(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x5A1A, "unknown") { unknown_01ED_5A1A_78EA() }
  fun unknown_01ED_5A1A_78EA(): Runnable {
    // unknown_01ED_18BA_378A();
    // unknown_01ED_5B5D_7A2D();
    // ida.transition_ida_01ED_C108_DFD8();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x5A56, "unknown") { unknown_01ED_5A56_7926() }
  fun unknown_01ED_5A56_7926(): Runnable {
    // unknown_01ED_1797_3667();
    // mainCode.setUnknown11CATo1_01ED_4ACA_699A();
    // unknown_01ED_5A9A_796A();
    // unknown_01ED_5B69_7A39();
    // mainCode.memCopy8BytesDsSIToDsDi_01ED_5B99_7A69();
    // unknown_01ED_AD5E_CC2E();
    // unknown_01ED_B930_D800();
    // ida.load_icons_sprites_ida_01ED_C137_E007();
    // unknown_01ED_D200_F0D0();
    // unknown_01ED_D2BD_F18D();
    // unknown_01ED_D741_F611();
    // unknown_01ED_D792_F662();
    // unknown_01ED_DA25_F8F5();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x5A9A, "unknown") { unknown_01ED_5A9A_796A() }
  fun unknown_01ED_5A9A_796A(): Runnable {
    // unknown_01ED_5B8D_7A5D();
    // unknown_01ED_5DCE_7C9E();
    // unknown_01ED_6314_81E4();
    // unknown_01ED_6715_85E5();
    // unknown_01ED_878C_A65C();
    // ida.map_func_ida_01ED_B6C3_D593();
    // display.setVideoBufferSegmentDBD6/set_frontbuffer_as_active_framebuffer_ida_01ED_C07C_DF4C();
    // unknown_01ED_C13B_E00B();
    // unknown_01ED_C412_E2E2();
    // unknown_01ED_C6AD_E57D();
    // map.setMapClickHandlerAddressFromAx_01ED_D95E_F82E();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x5ADF, "unknown") { unknown_01ED_5ADF_79AF() }
  fun unknown_01ED_5ADF_79AF(): Runnable {
    // unknown_01ED_7B36_9A06();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x5B5D, "unknown") { unknown_01ED_5B5D_7A2D() }
  fun unknown_01ED_5B5D_7A2D(): Runnable {
    // unknown_01ED_407E_5F4E();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x5B69, "unknown") { unknown_01ED_5B69_7A39() }
  fun unknown_01ED_5B69_7A39(): Runnable {
    // unknown_01ED_C560_E430();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x5B8D, "unknown") { unknown_01ED_5B8D_7A5D() }
  fun unknown_01ED_5B8D_7A5D(): Runnable {
    // map.unknownMemcopy_01ED_5B96_7A66();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x5B93, "unknown") { unknown_01ED_5B93_7A63() }
  fun unknown_01ED_5B93_7A63(): Runnable {

    return nearRet()
  }

  // Not providing stub for map.unknownMemcopy. Reason: Function already has an override

  // Not providing stub for mainCode.memCopy8BytesDsSIToDsDi. Reason: Function already has an override

  // Not providing stub for mainCode.memCopy8BytesFrom1470ToD83C. Reason: Function already has an override

  // Not providing stub for mainCode.memCopy8Bytes. Reason: Function already has an override

  // defineFunction(0x1ED, 0x5BB0, "unknown") { unknown_01ED_5BB0_7A80() }
  fun unknown_01ED_5BB0_7A80(): Runnable {
    // unknown_01ED_7B1B_99EB();
    // display.setTextVideoBufferSegmentDBD8/set_screen_as_active_framebuffer_ida_01ED_C08E_DF5E();
    // unknown_01ED_CF70_EE40();
    // unknown_01ED_D03C_EF0C();
    // display.setFontToIntro_01ED_D068_EF38();
    // unknown_01ED_D194_F064();
    // unknown_01ED_E2E3_01B3();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x5BEB, "unknown") { unknown_01ED_5BEB_7ABB() }
  fun unknown_01ED_5BEB_7ABB(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x5C03, "unknown") { unknown_01ED_5C03_7AD3() }
  fun unknown_01ED_5C03_7AD3(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x5C76, "unknown") { unknown_01ED_5C76_7B46() }
  fun unknown_01ED_5C76_7B46(): Runnable {
    // unknown_01ED_58FA_77CA();
    // unknown_01ED_5BEB_7ABB();
    // unknown_01ED_5E6D_7D3D();
    // unknown_01ED_5F79_7E49();
    // unknown_01ED_6946_8816();
    // unknown_01ED_79DE_98AE();
    // unknown_01ED_C13B_E00B();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x5D1D, "unknown") { unknown_01ED_5D1D_7BED() }
  fun unknown_01ED_5D1D_7BED(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x5D36, "unknown") { unknown_01ED_5D36_7C06() }
  fun unknown_01ED_5D36_7C06(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x5DCE, "unknown") { unknown_01ED_5DCE_7C9E() }
  fun unknown_01ED_5DCE_7C9E(): Runnable {
    // unknown_01ED_5E42_7D12();
    // unknown_01ED_62C9_8199();
    // unknown_01ED_633B_820B();
    // unknown_01ED_7C8F_9B5F();
    // unknown_01ED_C343_E213();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x5E42, "unknown") { unknown_01ED_5E42_7D12() }
  fun unknown_01ED_5E42_7D12(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x5E4F, "calc_SAL_index_ida") { calc_SAL_index_ida_01ED_5E4F_7D1F() }
  fun calc_SAL_index_ida_01ED_5E4F_7D1F(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x5E6D, "unknown") { unknown_01ED_5E6D_7D3D() }
  fun unknown_01ED_5E6D_7D3D(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x5ED0, "unknown") { unknown_01ED_5ED0_7DA0() }
  fun unknown_01ED_5ED0_7DA0(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x5F79, "unknown") { unknown_01ED_5F79_7E49() }
  fun unknown_01ED_5F79_7E49(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x6231, "unknown") { unknown_01ED_6231_8101() }
  fun unknown_01ED_6231_8101(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x629D, "unknown") { unknown_01ED_629D_816D() }
  fun unknown_01ED_629D_816D(): Runnable {
    // unknown_01ED_6231_8101();
    // unknown_01ED_CF70_EE40();
    // unknown_01ED_D04E_EF1E();
    // unknown_01ED_D1BB_F08B();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x62A6, "unknown") { unknown_01ED_62A6_8176() }
  fun unknown_01ED_62A6_8176(): Runnable {
    // unknown_01ED_CF70_EE40();
    // unknown_01ED_D12F_EFFF();
    // unknown_01ED_D194_F064();
    // unknown_01ED_D1BB_F08B();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x62C9, "unknown") { unknown_01ED_62C9_8199() }
  fun unknown_01ED_62C9_8199(): Runnable {
    // unknown_01ED_B647_D517();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x62D6, "unknown") { unknown_01ED_62D6_81A6() }
  fun unknown_01ED_62D6_81A6(): Runnable {
    // unknown_01ED_B647_D517();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x6314, "unknown") { unknown_01ED_6314_81E4() }
  fun unknown_01ED_6314_81E4(): Runnable {
    // unknown_01ED_407E_5F4E();
    // unknown_01ED_62D6_81A6();
    // ida.load_icons_sprites_ida_01ED_C137_E007();
    // unknown_01ED_C1AA_E07A();
    // datastructures.getEsSiPointerToUnknown_01ED_C1F4_E0C4();
    // unknown_01ED_C30D_E1DD();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x633B, "unknown") { unknown_01ED_633B_820B() }
  fun unknown_01ED_633B_820B(): Runnable {
    // unknown_01ED_634D_821D();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x634D, "unknown") { unknown_01ED_634D_821D() }
  fun unknown_01ED_634D_821D(): Runnable {
    // unknown_01ED_62D6_81A6();
    // unknown_01ED_636A_823A();
    // unknown_01ED_639A_826A();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x636A, "unknown") { unknown_01ED_636A_823A() }
  fun unknown_01ED_636A_823A(): Runnable {
    // ida.map_func_ida_01ED_B58B_D45B();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x639A, "unknown") { unknown_01ED_639A_826A() }
  fun unknown_01ED_639A_826A(): Runnable {
    // ida.map_func_ida_01ED_B58B_D45B();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x63F0, "map_func_qq_ida") { map_func_qq_ida_01ED_63F0_82C0() }
  fun map_func_qq_ida_01ED_63F0_82C0(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x644E, "unknown") { unknown_01ED_644E_831E() }
  fun unknown_01ED_644E_831E(): Runnable {
    // unknown_01ED_64EF_83BF();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x646F, "unknown") { unknown_01ED_646F_833F() }
  fun unknown_01ED_646F_833F(): Runnable {
    // ida.map_func_ida_01ED_B58B_D45B();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x64EF, "unknown") { unknown_01ED_64EF_83BF() }
  fun unknown_01ED_64EF_83BF(): Runnable {
    // unknown_01ED_646F_833F();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x6603, "unknown") { unknown_01ED_6603_84D3() }
  fun unknown_01ED_6603_84D3(): Runnable {
    // unknown_01ED_01E0_20B0();
    // unknown_01ED_316E_503E();
    // unknown_01ED_3406_52D6();
    // unknown_01ED_34D0_53A0();
    // unknown_01ED_6906_87D6();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x6639, "unknown") { unknown_01ED_6639_8509() }
  fun unknown_01ED_6639_8509(): Runnable {
    // unknown_01ED_6603_84D3();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x66CE, "unknown") { unknown_01ED_66CE_859E() }
  fun unknown_01ED_66CE_859E(): Runnable {
    // unknown_01ED_1AC5_3995();
    // unknown_01ED_644E_831E();
    // unknown_01ED_6B25_89F5();
    // unknown_01ED_6F78_8E48();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x6715, "unknown") { unknown_01ED_6715_85E5() }
  fun unknown_01ED_6715_85E5(): Runnable {
    // unknown_01ED_6757_8627();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x6757, "unknown") { unknown_01ED_6757_8627() }
  fun unknown_01ED_6757_8627(): Runnable {
    // unknown_01ED_6770_8640();
    // unknown_01ED_686E_873E();
    // unknown_01ED_6906_87D6();
    // unknown_01ED_C5CF_E49F();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x6770, "unknown") { unknown_01ED_6770_8640() }
  fun unknown_01ED_6770_8640(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x686E, "unknown") { unknown_01ED_686E_873E() }
  fun unknown_01ED_686E_873E(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x68EB, "unknown") { unknown_01ED_68EB_87BB() }
  fun unknown_01ED_68EB_87BB(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x6906, "unknown") { unknown_01ED_6906_87D6() }
  fun unknown_01ED_6906_87D6(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x6917, "unknown") { unknown_01ED_6917_87E7() }
  fun unknown_01ED_6917_87E7(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x693B, "unknown") { unknown_01ED_693B_880B() }
  fun unknown_01ED_693B_880B(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x6946, "unknown") { unknown_01ED_6946_8816() }
  fun unknown_01ED_6946_8816(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x697C, "unknown") { unknown_01ED_697C_884C() }
  fun unknown_01ED_697C_884C(): Runnable {
    // unknown_01ED_5ED0_7DA0();
    // unknown_01ED_686E_873E();
    // unknown_01ED_6917_87E7();
    // unknown_01ED_C5CF_E49F();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x69A3, "unknown") { unknown_01ED_69A3_8873() }
  fun unknown_01ED_69A3_8873(): Runnable {
    // unknown_01ED_C58A_E45A();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x6ACB, "unknown") { unknown_01ED_6ACB_899B() }
  fun unknown_01ED_6ACB_899B(): Runnable {
    // unknown_01ED_693B_880B();
    // unknown_01ED_6B25_89F5();
    // unknown_01ED_6C15_8AE5();
    // unknown_01ED_7847_9717();
    // unknown_01ED_8461_A331();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x6B25, "unknown") { unknown_01ED_6B25_89F5() }
  fun unknown_01ED_6B25_89F5(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x6B34, "unknown") { unknown_01ED_6B34_8A04() }
  fun unknown_01ED_6B34_8A04(): Runnable {
    // unknown_01ED_C661_E531();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x6B96, "unknown") { unknown_01ED_6B96_8A66() }
  fun unknown_01ED_6B96_8A66(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x6C15, "unknown") { unknown_01ED_6C15_8AE5() }
  fun unknown_01ED_6C15_8AE5(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x6C46, "unknown") { unknown_01ED_6C46_8B16() }
  fun unknown_01ED_6C46_8B16(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x6C6F, "unknown") { unknown_01ED_6C6F_8B3F() }
  fun unknown_01ED_6C6F_8B3F(): Runnable {
    // unknown_01ED_6C46_8B16();
    // unknown_01ED_6D19_8BE9();
    // unknown_01ED_6D7B_8C4B();
    // unknown_01ED_6FE5_8EB5();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x6D19, "unknown") { unknown_01ED_6D19_8BE9() }
  fun unknown_01ED_6D19_8BE9(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x6D7B, "unknown") { unknown_01ED_6D7B_8C4B() }
  fun unknown_01ED_6D7B_8C4B(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x6E20, "unknown") { unknown_01ED_6E20_8CF0() }
  fun unknown_01ED_6E20_8CF0(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x6EFD, "unknown") { unknown_01ED_6EFD_8DCD() }
  fun unknown_01ED_6EFD_8DCD(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x6F78, "unknown") { unknown_01ED_6F78_8E48() }
  fun unknown_01ED_6F78_8E48(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x6FE5, "unknown") { unknown_01ED_6FE5_8EB5() }
  fun unknown_01ED_6FE5_8EB5(): Runnable {
    // unknown_01ED_6B96_8A66();
    // unknown_01ED_6E20_8CF0();
    // unknown_01ED_708A_8F5A();
    // unknown_01ED_714C_901C();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x708A, "unknown") { unknown_01ED_708A_8F5A() }
  fun unknown_01ED_708A_8F5A(): Runnable {
    // unknown_01ED_6EFD_8DCD();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x714C, "unknown") { unknown_01ED_714C_901C() }
  fun unknown_01ED_714C_901C(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x780A, "unknown") { unknown_01ED_780A_96DA() }
  fun unknown_01ED_780A_96DA(): Runnable {
    // unknown_01ED_7847_9717();
    // unknown_01ED_7C63_9B33();
    // unknown_01ED_C1AA_E07A();
    // unknown_01ED_D323_F1F3();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x7847, "unknown") { unknown_01ED_7847_9717() }
  fun unknown_01ED_7847_9717(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x79DE, "unknown") { unknown_01ED_79DE_98AE() }
  fun unknown_01ED_79DE_98AE(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x79EE, "unknown") { unknown_01ED_79EE_98BE() }
  fun unknown_01ED_79EE_98BE(): Runnable {
    // unknown_01ED_6917_87E7();
    // unknown_01ED_7B0F_99DF();
    // unknown_01ED_7B1B_99EB();
    // unknown_01ED_91A0_B070();
    // unknown_01ED_9D6A_BC3A();
    // unknown_01ED_C0F4_DFC4();
    // unknown_01ED_C1AA_E07A();
    // ida.gfx_copy_rect_to_screen_ida_01ED_C4AA_E37A();
    // ida.open_resource_by_index_si_ida_01ED_F0B9_0F89();
    // vgaDriver.noOp_2538_013C_54BC();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x7B0F, "unknown") { unknown_01ED_7B0F_99DF() }
  fun unknown_01ED_7B0F_99DF(): Runnable {
    // unknown_01ED_C0E8_DFB8();
    // unknown_01ED_C53E_E40E();
    // unknown_2538_011E_549E();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x7B1B, "unknown") { unknown_01ED_7B1B_99EB() }
  fun unknown_01ED_7B1B_99EB(): Runnable {
    // unknown_01ED_C53E_E40E();
    // unknown_2538_011E_549E();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x7B2B, "unknown") { unknown_01ED_7B2B_99FB() }
  fun unknown_01ED_7B2B_99FB(): Runnable {
    // unknown_2538_015A_54DA();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x7B36, "unknown") { unknown_01ED_7B36_9A06() }
  fun unknown_01ED_7B36_9A06(): Runnable {
    // unknown_01ED_5F79_7E49();
    // unknown_01ED_79DE_98AE();
    // unknown_01ED_8770_A640();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x7B58, "unknown") { unknown_01ED_7B58_9A28() }
  fun unknown_01ED_7B58_9A28(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x7BA3, "unknown") { unknown_01ED_7BA3_9A73() }
  fun unknown_01ED_7BA3_9A73(): Runnable {
    // unknown_01ED_79EE_98BE();
    // unknown_01ED_9F40_BE10();
    // display.setTextVideoBufferSegmentDBD8/set_screen_as_active_framebuffer_ida_01ED_C08E_DF5E();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x7BB9, "unknown") { unknown_01ED_7BB9_9A89() }
  fun unknown_01ED_7BB9_9A89(): Runnable {
    // unknown_01ED_31F6_50C6();
    // unknown_01ED_96F1_B5C1();
    // display.set479ETo0_01ED_9901_B7D1();
    // unknown_01ED_9EFD_BDCD();
    // display.setTextVideoBufferSegmentDBD8/set_screen_as_active_framebuffer_ida_01ED_C08E_DF5E();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x7C02, "unknown") { unknown_01ED_7C02_9AD2() }
  fun unknown_01ED_7C02_9AD2(): Runnable {
    // unknown_01ED_2E98_4D68();
    // unknown_01ED_31F6_50C6();
    // unknown_01ED_7BA3_9A73();
    // unknown_01ED_7C63_9B33();
    // unknown_01ED_9719_B5E9();
    // display.set479ETo0_01ED_9901_B7D1();
    // unknown_01ED_9EFD_BDCD();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x7C63, "unknown") { unknown_01ED_7C63_9B33() }
  fun unknown_01ED_7C63_9B33(): Runnable {
    // unknown_01ED_407E_5F4E();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x7C8F, "unknown") { unknown_01ED_7C8F_9B5F() }
  fun unknown_01ED_7C8F_9B5F(): Runnable {
    // unknown_01ED_407E_5F4E();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x7F27, "unknown") { unknown_01ED_7F27_9DF7() }
  fun unknown_01ED_7F27_9DF7(): Runnable {
    // unknown_01ED_6906_87D6();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x8461, "unknown") { unknown_01ED_8461_A331() }
  fun unknown_01ED_8461_A331(): Runnable {
    // unknown_01ED_5ED0_7DA0();
    // unknown_01ED_6757_8627();
    // unknown_01ED_6917_87E7();
    // unknown_01ED_C58A_E45A();
    // unknown_01ED_C6AD_E57D();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x8751, "unknown") { unknown_01ED_8751_A621() }
  fun unknown_01ED_8751_A621(): Runnable {
    // unknown_01ED_1AC5_3995();
    // unknown_01ED_1EBE_3D8E();
    // unknown_01ED_69A3_8873();
    // unknown_01ED_7B2B_99FB();
    // unknown_01ED_A7A5_C675();
    // unknown_01ED_C6AD_E57D();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x8770, "unknown") { unknown_01ED_8770_A640() }
  fun unknown_01ED_8770_A640(): Runnable {
    // unknown_01ED_878C_A65C();
    // display.pushAll_01ED_E270_0140();
    // display.popAll_01ED_E283_0153();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x878C, "unknown") { unknown_01ED_878C_A65C() }
  fun unknown_01ED_878C_A65C(): Runnable {
    // unknown_01ED_6906_87D6();
    // unknown_01ED_7F27_9DF7();
    // unknown_01ED_D338_F208();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x88AF, "unknown") { unknown_01ED_88AF_A77F() }
  fun unknown_01ED_88AF_A77F(): Runnable {
    // unknown_01ED_88F1_A7C1();
    // unknown_01ED_8944_A814();
    // unknown_01ED_8B11_A9E1();
    // unknown_01ED_CF70_EE40();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x88E1, "unknown") { unknown_01ED_88E1_A7B1() }
  fun unknown_01ED_88E1_A7B1(): Runnable {
    // unknown_01ED_8B11_A9E1();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x88F1, "unknown") { unknown_01ED_88F1_A7C1() }
  fun unknown_01ED_88F1_A7C1(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x8944, "unknown") { unknown_01ED_8944_A814() }
  fun unknown_01ED_8944_A814(): Runnable {
    // unknown_01ED_8A3B_A90B();
    // unknown_01ED_8AC3_A993();
    // unknown_01ED_CF70_EE40();
    // unknown_01ED_E3B7_0287();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x8A3B, "unknown") { unknown_01ED_8A3B_A90B() }
  fun unknown_01ED_8A3B_A90B(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x8AC3, "unknown") { unknown_01ED_8AC3_A993() }
  fun unknown_01ED_8AC3_A993(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x8B11, "unknown") { unknown_01ED_8B11_A9E1() }
  fun unknown_01ED_8B11_A9E1(): Runnable {
    // unknown_01ED_8C8A_AB5A();
    // unknown_01ED_8CCD_AB9D();
    // unknown_01ED_8DF0_ACC0();
    // unknown_01ED_8F28_ADF8();
    // unknown_01ED_9046_AF16();
    // unknown_01ED_D04E_EF1E();
    // display.setFontToMenu_01ED_D075_EF45();
    // unknown_01ED_D096_EF66();
    // unknown_01ED_D0FF_EFCF();
    // unknown_01ED_D12F_EFFF();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x8C8A, "unknown") { unknown_01ED_8C8A_AB5A() }
  fun unknown_01ED_8C8A_AB5A(): Runnable {
    // unknown_01ED_9BAC_BA7C();
    // unknown_01ED_C446_E316();
    // unknown_01ED_C4DD_E3AD();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x8CCD, "unknown") { unknown_01ED_8CCD_AB9D() }
  fun unknown_01ED_8CCD_AB9D(): Runnable {
    // unknown_01ED_8E16_ACE6();
    // display.setFontToBook_01ED_D082_EF52();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x8DF0, "unknown") { unknown_01ED_8DF0_ACC0() }
  fun unknown_01ED_8DF0_ACC0(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x8E16, "unknown") { unknown_01ED_8E16_ACE6() }
  fun unknown_01ED_8E16_ACE6(): Runnable {
    // unknown_01ED_8E9E_AD6E();
    // unknown_01ED_8ED3_ADA3();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x8E9E, "unknown") { unknown_01ED_8E9E_AD6E() }
  fun unknown_01ED_8E9E_AD6E(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x8ED3, "unknown") { unknown_01ED_8ED3_ADA3() }
  fun unknown_01ED_8ED3_ADA3(): Runnable {
    // unknown_01ED_D0E3_EFB3();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x8F28, "unknown") { unknown_01ED_8F28_ADF8() }
  fun unknown_01ED_8F28_ADF8(): Runnable {
    // display.setDialogueVideoBufferSegmentDC32/set_backbuffer_as_frame_buffer_ida_01ED_C085_DF55();
    // ida.open_sprite_sheet_ida_01ED_C13E_E00E();
    // unknown_01ED_C370_E240();
    // unknown_2538_011E_549E();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x9025, "unknown") { unknown_01ED_9025_AEF5() }
  fun unknown_01ED_9025_AEF5(): Runnable {
    // vgaDriver.blit_2538_010F_548F();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x9046, "unknown") { unknown_01ED_9046_AF16() }
  fun unknown_01ED_9046_AF16(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x908C, "unknown") { unknown_01ED_908C_AF5C() }
  fun unknown_01ED_908C_AF5C(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x90BD, "unknown") { unknown_01ED_90BD_AF8D() }
  fun unknown_01ED_90BD_AF8D(): Runnable {
    // unknown_01ED_92C9_B199();
    // mainCode.menuAnimationRelated_01ED_D316_F1E6();
    // mainCode.setBpToCurrentMenuTypeForScreenAction_01ED_D41B_F2EB();
    // mainCode.dispatcherHelperDeterminesWhereToJump_01ED_D454_F324();
    // unknown_01ED_D48A_F35A();
    // unknown_01ED_D6FE_F5CE();
    // ida.call_restore_cursor_ida_01ED_DBB2_FA82();
    // ida.draw_mouse_ida_01ED_DBEC_FABC();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x9123, "unknown") { unknown_01ED_9123_AFF3() }
  fun unknown_01ED_9123_AFF3(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x9197, "unknown") { unknown_01ED_9197_B067() }
  fun unknown_01ED_9197_B067(): Runnable {
    // unknown_01ED_9123_AFF3();
    // unknown_01ED_C1AA_E07A();
    // ida.open_resource_by_index_si_ida_01ED_F0B9_0F89();
    // vgaDriver.noOp_2538_013C_54BC();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x91A0, "unknown") { unknown_01ED_91A0_B070() }
  fun unknown_01ED_91A0_B070(): Runnable {
    // unknown_01ED_9123_AFF3();
    // unknown_01ED_920F_B0DF();
    // unknown_01ED_98B2_B782();
    // unknown_01ED_C1AA_E07A();
    // ida.open_resource_by_index_si_ida_01ED_F0B9_0F89();
    // vgaDriver.noOp_2538_013C_54BC();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x920F, "unknown") { unknown_01ED_920F_B0DF() }
  fun unknown_01ED_920F_B0DF(): Runnable {
    // unknown_01ED_C1AA_E07A();
    // ida.open_resource_by_index_si_ida_01ED_F0B9_0F89();
    // vgaDriver.noOp_2538_013C_54BC();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x9215, "unknown") { unknown_01ED_9215_B0E5() }
  fun unknown_01ED_9215_B0E5(): Runnable {
    // unknown_01ED_1797_3667();
    // unknown_01ED_1834_3704();
    // ida.open_SAL_resource_ida_01ED_2D74_4C44();
    // unknown_01ED_31F6_50C6();
    // unknown_01ED_35AD_547D();
    // unknown_01ED_36D3_55A3();
    // unknown_01ED_37B2_5682();
    // unknown_01ED_38E1_57B1();
    // unknown_01ED_3AF9_59C9();
    // unknown_01ED_3EFE_5DCE();
    // unknown_01ED_40C3_5F93();
    // unknown_01ED_439F_626F();
    // unknown_01ED_445D_632D();
    // unknown_01ED_4658_6528();
    // unknown_01ED_49EA_68BA();
    // mainCode.setUnknown11CATo1_01ED_4ACA_699A();
    // unknown_01ED_5B5D_7A2D();
    // unknown_01ED_5B93_7A63();
    // mainCode.memCopy8BytesDsSIToDsDi_01ED_5B99_7A69();
    // mainCode.memCopy8BytesFrom1470ToD83C_01ED_5BA0_7A70();
    // unknown_01ED_5DCE_7C9E();
    // unknown_01ED_9197_B067();
    // unknown_01ED_91A0_B070();
    // unknown_01ED_9285_B155();
    // unknown_01ED_93DF_B2AF();
    // unknown_01ED_98B2_B782();
    // unknown_01ED_9908_B7D8();
    // unknown_01ED_9B49_BA19();
    // unknown_01ED_9BAC_BA7C();
    // unknown_01ED_9F40_BE10();
    // unknown_01ED_9F9E_BE6E();
    // unknown_01ED_A1C4_C094();
    // unknown_01ED_A1E2_C0B2();
    // unknown_01ED_A7A5_C675();
    // unknown_01ED_A7C2_C692();
    // unknown_01ED_AB4F_CA1F();
    // unknown_01ED_ABD5_CAA5();
    // sound.soundDriverUnknownClearAL/call_pcm_audio_vtable_func_5_ida_01ED_AC30_CB00();
    // unknown_01ED_AD5E_CC2E();
    // unknown_01ED_AE04_CCD4();
    // ida.open_sav_cl_ida_01ED_B389_D259();
    // ida.map_func_ida_01ED_B6C3_D593();
    // display.setVideoBufferSegmentDBD6/set_frontbuffer_as_active_framebuffer_ida_01ED_C07C_DF4C();
    // ida.gfx_call_bp_with_front_buffer_as_screen_ida_01ED_C097_DF67();
    // unknown_01ED_C0D5_DFA5();
    // unknown_01ED_C0F4_DFC4();
    // ida.transition_ida_01ED_C108_DFD8();
    // ida.load_icons_sprites_ida_01ED_C137_E007();
    // ida.open_sprite_sheet_ida_01ED_C13E_E00E();
    // unknown_01ED_C21B_E0EB();
    // unknown_01ED_C412_E2E2();
    // unknown_01ED_C4DD_E3AD();
    // unknown_01ED_D239_F109();
    // unknown_01ED_D23D_F10D();
    // unknown_01ED_D2BD_F18D();
    // unknown_01ED_D323_F1F3();
    // mainCode.setBpToCurrentMenuTypeForScreenAction_01ED_D41B_F2EB();
    // unknown_01ED_D72B_F5FB();
    // map.setMapClickHandlerAddressFromAx_01ED_D95E_F82E();
    // map.setSiToMapCursorTypeDC58_01ED_DAAA_F97A();
    // display.pushAll_01ED_E270_0140();
    // display.popAll_01ED_E283_0153();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x9285, "unknown") { unknown_01ED_9285_B155() }
  fun unknown_01ED_9285_B155(): Runnable {
    // unknown_01ED_D6FE_F5CE();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x92C9, "unknown") { unknown_01ED_92C9_B199() }
  fun unknown_01ED_92C9_B199(): Runnable {
    // unknown_01ED_D6FE_F5CE();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x93DF, "unknown") { unknown_01ED_93DF_B2AF() }
  fun unknown_01ED_93DF_B2AF(): Runnable {
    // unknown_01ED_90BD_AF8D();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x945B, "unknown") { unknown_01ED_945B_B32B() }
  fun unknown_01ED_945B_B32B(): Runnable {
    // unknown_01ED_9B49_BA19();
    // unknown_01ED_9F40_BE10();
    // unknown_01ED_9F9E_BE6E();
    // unknown_01ED_A7C2_C692();
    // unknown_01ED_C0D5_DFA5();
    // unknown_01ED_D239_F109();
    // unknown_01ED_D23D_F10D();
    // unknown_01ED_D2EA_F1BA();
    // mainCode.menuAnimationRelated_01ED_D316_F1E6();
    // mainCode.setBpToCurrentMenuTypeForScreenAction_01ED_D41B_F2EB();
    // display.pushAll_01ED_E270_0140();
    // display.popAll_01ED_E283_0153();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x94F3, "unknown") { unknown_01ED_94F3_B3C3() }
  fun unknown_01ED_94F3_B3C3(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x956D, "unknown") { unknown_01ED_956D_B43D() }
  fun unknown_01ED_956D_B43D(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x9673, "unknown") { unknown_01ED_9673_B543() }
  fun unknown_01ED_9673_B543(): Runnable {
    // ida.load_icons_sprites_ida_01ED_C137_E007();
    // unknown_01ED_D1F2_F0C2();
    // unknown_01ED_D200_F0D0();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x96B5, "unknown") { unknown_01ED_96B5_B585() }
  fun unknown_01ED_96B5_B585(): Runnable {
    // unknown_01ED_9F9E_BE6E();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x96F1, "unknown") { unknown_01ED_96F1_B5C1() }
  fun unknown_01ED_96F1_B5C1(): Runnable {
    // unknown_01ED_31F6_50C6();
    // unknown_01ED_9F40_BE10();
    // unknown_01ED_9F9E_BE6E();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x9719, "unknown") { unknown_01ED_9719_B5E9() }
  fun unknown_01ED_9719_B5E9(): Runnable {
    // unknown_01ED_2A51_4921();
    // unknown_01ED_9F82_BE52();
    // unknown_01ED_9F9E_BE6E();
    // unknown_01ED_A1C4_C094();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x978E, "unknown") { unknown_01ED_978E_B65E() }
  fun unknown_01ED_978E_B65E(): Runnable {
    // unknown_01ED_1797_3667();
    // mainCode.setUnknown11CATo1_01ED_4ACA_699A();
    // unknown_01ED_9025_AEF5();
    // unknown_01ED_91A0_B070();
    // unknown_01ED_9908_B7D8();
    // unknown_01ED_9BAC_BA7C();
    // unknown_01ED_C0F4_DFC4();
    // ida.gfx_copy_rect_at_si_ida_01ED_C477_E347();
    // ida.call_restore_cursor_ida_01ED_DBB2_FA82();
    // vgaDriver.copySquareOfPixels_2538_0130_54B0();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x97CF, "unknown") { unknown_01ED_97CF_B69F() }
  fun unknown_01ED_97CF_B69F(): Runnable {
    // unknown_01ED_17BE_368E();
    // unknown_01ED_1834_3704();
    // unknown_01ED_2EFB_4DCB();
    // unknown_01ED_3090_4F60();
    // unknown_01ED_37B2_5682();
    // unknown_01ED_8C8A_AB5A();
    // unknown_01ED_9673_B543();
    // unknown_01ED_9B8B_BA5B();
    // unknown_01ED_A7A5_C675();
    // unknown_01ED_C0F4_DFC4();
    // unknown_01ED_C412_E2E2();
    // unknown_01ED_C4DD_E3AD();
    // unknown_01ED_E387_0257();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x98B2, "unknown") { unknown_01ED_98B2_B782() }
  fun unknown_01ED_98B2_B782(): Runnable {
    // unknown_01ED_A7A5_C675();
    // unknown_01ED_C446_E316();
    // ida.rect_at_si_to_regs_ida_01ED_C4F0_E3C0();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x98E6, "unknown") { unknown_01ED_98E6_B7B6() }
  fun unknown_01ED_98E6_B7B6(): Runnable {
    // display.clearUnknownValuesAndAX_01ED_98F5_B7C5();
    // unknown_01ED_A7A5_C675();

    return nearRet()
  }

  // Not providing stub for display.clearUnknownValuesAndAX. Reason: Function already has an override

  // Not providing stub for display.set479ETo0. Reason: Function already has an override

  // defineFunction(0x1ED, 0x9908, "unknown") { unknown_01ED_9908_B7D8() }
  fun unknown_01ED_9908_B7D8(): Runnable {
    // unknown_01ED_127C_314C();
    // unknown_01ED_994F_B81F();
    // unknown_01ED_996C_B83C();
    // unknown_01ED_DA25_F8F5();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x994F, "unknown") { unknown_01ED_994F_B81F() }
  fun unknown_01ED_994F_B81F(): Runnable {
    // unknown_01ED_E3B7_0287();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x996C, "unknown") { unknown_01ED_996C_B83C() }
  fun unknown_01ED_996C_B83C(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x9985, "unknown") { unknown_01ED_9985_B855() }
  fun unknown_01ED_9985_B855(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x99BE, "unknown") { unknown_01ED_99BE_B88E() }
  fun unknown_01ED_99BE_B88E(): Runnable {
    // unknown_01ED_908C_AF5C();
    // unknown_01ED_9197_B067();
    // unknown_01ED_994F_B81F();
    // unknown_01ED_996C_B83C();
    // unknown_01ED_9A7B_B94B();
    // unknown_01ED_9AB4_B984();
    // unknown_01ED_9BB1_BA81();
    // ida.rect_at_si_to_regs_ida_01ED_C4F0_E3C0();
    // unknown_01ED_DB74_FA44();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x9A7B, "unknown") { unknown_01ED_9A7B_B94B() }
  fun unknown_01ED_9A7B_B94B(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x9AB4, "unknown") { unknown_01ED_9AB4_B984() }
  fun unknown_01ED_9AB4_B984(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x9B49, "unknown") { unknown_01ED_9B49_BA19() }
  fun unknown_01ED_9B49_BA19(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x9B8B, "unknown") { unknown_01ED_9B8B_BA5B() }
  fun unknown_01ED_9B8B_BA5B(): Runnable {
    // unknown_01ED_A7A5_C675();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x9BAC, "unknown") { unknown_01ED_9BAC_BA7C() }
  fun unknown_01ED_9BAC_BA7C(): Runnable {
    // mainCode.memCopy8BytesDsSIToDsDi_01ED_5B99_7A69();
    // unknown_01ED_9197_B067();
    // unknown_01ED_9BEE_BABE();
    // unknown_01ED_9D16_BBE6();
    // unknown_01ED_C446_E316();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x9BB1, "unknown") { unknown_01ED_9BB1_BA81() }
  fun unknown_01ED_9BB1_BA81(): Runnable {
    // unknown_01ED_9BEE_BABE();
    // unknown_01ED_9C2D_BAFD();
    // unknown_01ED_9D16_BBE6();
    // unknown_01ED_C446_E316();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x9BEE, "unknown") { unknown_01ED_9BEE_BABE() }
  fun unknown_01ED_9BEE_BABE(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x9C2D, "unknown") { unknown_01ED_9C2D_BAFD() }
  fun unknown_01ED_9C2D_BAFD(): Runnable {
    // unknown_01ED_9C54_BB24();
    // unknown_01ED_9CC6_BB96();
    // mainCode.isUnknownDC2BZero_01ED_ABCC_CA9C();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x9C54, "unknown") { unknown_01ED_9C54_BB24() }
  fun unknown_01ED_9C54_BB24(): Runnable {
    // unknown_01ED_9CC6_BB96();
    // mainCode.isUnknownDC2BZero_01ED_ABCC_CA9C();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x9CC6, "unknown") { unknown_01ED_9CC6_BB96() }
  fun unknown_01ED_9CC6_BB96(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x9D16, "unknown") { unknown_01ED_9D16_BBE6() }
  fun unknown_01ED_9D16_BBE6(): Runnable {
    // unknown_2538_0112_5492();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x9D6A, "unknown") { unknown_01ED_9D6A_BC3A() }
  fun unknown_01ED_9D6A_BC3A(): Runnable {
    // unknown_01ED_9D94_BC64();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x9D94, "unknown") { unknown_01ED_9D94_BC64() }
  fun unknown_01ED_9D94_BC64(): Runnable {
    // unknown_2538_0112_5492();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x9EFD, "unknown") { unknown_01ED_9EFD_BDCD() }
  fun unknown_01ED_9EFD_BDCD(): Runnable {
    // unknown_01ED_A6CC_C59C();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x9F31, "unknown") { unknown_01ED_9F31_BE01() }
  fun unknown_01ED_9F31_BE01(): Runnable {
    // display.setVideoBufferSegmentDBD6/set_frontbuffer_as_active_framebuffer_ida_01ED_C07C_DF4C();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x9F40, "unknown") { unknown_01ED_9F40_BE10() }
  fun unknown_01ED_9F40_BE10(): Runnable {
    // display.setVideoBufferSegmentDBD6/set_frontbuffer_as_active_framebuffer_ida_01ED_C07C_DF4C();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x9F82, "unknown") { unknown_01ED_9F82_BE52() }
  fun unknown_01ED_9F82_BE52(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0x9F8B, "unknown") { unknown_01ED_9F8B_BE5B() }
  fun unknown_01ED_9F8B_BE5B(): Runnable {
    // unknown_01ED_9F9E_BE6E();

    return nearRet()
  }

  // defineFunction(0x1ED, 0x9F9E, "unknown") { unknown_01ED_9F9E_BE6E() }
  fun unknown_01ED_9F9E_BE6E(): Runnable {
    // mainCode.noOp_01ED_0F66_2E36();
    // unknown_01ED_1803_36D3();
    // unknown_01ED_2EBF_4D8F();
    // unknown_01ED_3AF9_59C9();
    // unknown_01ED_88AF_A77F();
    // unknown_01ED_91A0_B070();
    // unknown_01ED_94F3_B3C3();
    // unknown_01ED_978E_B65E();
    // unknown_01ED_9EFD_BDCD();
    // unknown_01ED_A0F1_BFC1();
    // unknown_01ED_A1D0_C0A0();
    // unknown_01ED_A1D6_C0A6();
    // unknown_01ED_A219_C0E9();
    // unknown_01ED_A235_C105();
    // unknown_01ED_A396_C266();
    // dialogues.initDialogue_01ED_C85B_E72B();
    // display.pushAll_01ED_E270_0140();
    // display.popAll_01ED_E283_0153();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xA0F1, "unknown") { unknown_01ED_A0F1_BFC1() }
  fun unknown_01ED_A0F1_BFC1(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xA1C4, "unknown") { unknown_01ED_A1C4_C094() }
  fun unknown_01ED_A1C4_C094(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xA1D0, "unknown") { unknown_01ED_A1D0_C0A0() }
  fun unknown_01ED_A1D0_C0A0(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xA1D6, "unknown") { unknown_01ED_A1D6_C0A6() }
  fun unknown_01ED_A1D6_C0A6(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xA1E2, "unknown") { unknown_01ED_A1E2_C0B2() }
  fun unknown_01ED_A1E2_C0B2(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xA219, "unknown") { unknown_01ED_A219_C0E9() }
  fun unknown_01ED_A219_C0E9(): Runnable {
    // unknown_01ED_100B_2EDB();
    // unknown_01ED_B17A_D04A();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xA235, "unknown") { unknown_01ED_A235_C105() }
  fun unknown_01ED_A235_C105(): Runnable {
    // unknown_01ED_1027_2EF7();
    // unknown_01ED_102F_2EFF();
    // unknown_01ED_B17A_D04A();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xA30B, "unknown") { unknown_01ED_A30B_C1DB() }
  fun unknown_01ED_A30B_C1DB(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xA334, "unknown") { unknown_01ED_A334_C204() }
  fun unknown_01ED_A334_C204(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xA396, "unknown") { unknown_01ED_A396_C266() }
  fun unknown_01ED_A396_C266(): Runnable {
    // unknown_01ED_A30B_C1DB();
    // unknown_01ED_A334_C204();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xA42C, "unknown") { unknown_01ED_A42C_C2FC() }
  fun unknown_01ED_A42C_C2FC(): Runnable {
    // unknown_01ED_A465_C335();
    // display.setTextVideoBufferSegmentDBD8/set_screen_as_active_framebuffer_ida_01ED_C08E_DF5E();
    // ida.open_sprite_sheet_ida_01ED_C13E_E00E();
    // ida.draw_sprite_ida_01ED_C22F_E0FF();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xA44C, "unknown") { unknown_01ED_A44C_C31C() }
  fun unknown_01ED_A44C_C31C(): Runnable {
    // unknown_01ED_A465_C335();
    // display.setTextVideoBufferSegmentDBD8/set_screen_as_active_framebuffer_ida_01ED_C08E_DF5E();
    // ida.draw_sprite_ida_01ED_C22F_E0FF();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xA45C, "unknown") { unknown_01ED_A45C_C32C() }
  fun unknown_01ED_A45C_C32C(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xA465, "unknown") { unknown_01ED_A465_C335() }
  fun unknown_01ED_A465_C335(): Runnable {
    // unknown_01ED_A45C_C32C();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xA47D, "unknown") { unknown_01ED_A47D_C34D() }
  fun unknown_01ED_A47D_C34D(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xA4C6, "unknown") { unknown_01ED_A4C6_C396() }
  fun unknown_01ED_A4C6_C396(): Runnable {
    // unknown_01ED_A502_C3D2();
    // mainCode.isUnknownDBC80x100_01ED_AE28_CCF8();
    // mainCode.isUnknownDBC8And1/check_pcm_enabled_ida_01ED_AE2F_CCFF();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xA502, "unknown") { unknown_01ED_A502_C3D2() }
  fun unknown_01ED_A502_C3D2(): Runnable {
    // unknown_01ED_A45C_C32C();
    // display.setTextVideoBufferSegmentDBD8/set_screen_as_active_framebuffer_ida_01ED_C08E_DF5E();
    // ida.open_sprite_sheet_ida_01ED_C13E_E00E();
    // ida.draw_sprite_ida_01ED_C22F_E0FF();
    // unknown_01ED_C2FD_E1CD();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xA5AA, "unknown") { unknown_01ED_A5AA_C47A() }
  fun unknown_01ED_A5AA_C47A(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xA637, "unknown") { unknown_01ED_A637_C507() }
  fun unknown_01ED_A637_C507(): Runnable {
    // soundDriverPcSpeaker.clearAL_4822_0115_8335();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xA650, "unknown") { unknown_01ED_A650_C520() }
  fun unknown_01ED_A650_C520(): Runnable {
    // soundDriverPcSpeaker.clearAL_482B_0112_83C2();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xA6CC, "unknown") { unknown_01ED_A6CC_C59C() }
  fun unknown_01ED_A6CC_C59C(): Runnable {
    // unknown_01ED_9123_AFF3();
    // unknown_01ED_A7A5_C675();
    // unknown_01ED_A83F_C70F();
    // unknown_01ED_A8BC_C78C();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xA7A5, "unknown") { unknown_01ED_A7A5_C675() }
  fun unknown_01ED_A7A5_C675(): Runnable {
    // mainCode.isUnknownDC2BZero_01ED_ABCC_CA9C();
    // unknown_01ED_D61D_F4ED();
    // unknown_01ED_DA5F_F92F();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xA7C2, "unknown") { unknown_01ED_A7C2_C692() }
  fun unknown_01ED_A7C2_C692(): Runnable {
    // mainCode.isUnknownDC2BZero_01ED_ABCC_CA9C();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xA83F, "unknown") { unknown_01ED_A83F_C70F() }
  fun unknown_01ED_A83F_C70F(): Runnable {
    // mainCode.isUnknownDBC8And1/check_pcm_enabled_ida_01ED_AE2F_CCFF();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xA87E, "audio_test_frequency_ida") { audio_test_frequency_ida_01ED_A87E_C74E() }
  fun audio_test_frequency_ida_01ED_A87E_C74E(): Runnable {
    // mainCode.isUnknownDBC8And1/check_pcm_enabled_ida_01ED_AE2F_CCFF();

    return nearRet()
  }

  // Not providing stub for dialogues.unknown. Reason: Function already has an override

  // defineFunction(0x1ED, 0xA8BC, "unknown") { unknown_01ED_A8BC_C78C() }
  fun unknown_01ED_A8BC_C78C(): Runnable {
    // dialogues.unknown_01ED_A8B1_C781();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xA9A1, "close_res_file_handle_ida") { close_res_file_handle_ida_01ED_A9A1_C871() }
  fun close_res_file_handle_ida_01ED_A9A1_C871(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xAA0F, "decode_sd_block_ida") { decode_sd_block_ida_01ED_AA0F_C8DF() }
  fun decode_sd_block_ida_01ED_AA0F_C8DF(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xAA96, "unknown") { unknown_01ED_AA96_C966() }
  fun unknown_01ED_AA96_C966(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xAB15, "audio_start_voc_ida") { audio_start_voc_ida_01ED_AB15_C9E5() }
  fun audio_start_voc_ida_01ED_AB15_C9E5(): Runnable {
    // mainCode.isUnknownDC2BZero_01ED_ABCC_CA9C();
    // mainCode.isUnknownDBC8And1/check_pcm_enabled_ida_01ED_AE2F_CCFF();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xAB45, "unknown") { unknown_01ED_AB45_CA15() }
  fun unknown_01ED_AB45_CA15(): Runnable {
    // mainCode.isUnknownDBC8And1/check_pcm_enabled_ida_01ED_AE2F_CCFF();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xAB4F, "unknown") { unknown_01ED_AB4F_CA1F() }
  fun unknown_01ED_AB4F_CA1F(): Runnable {
    // unknown_01ED_A8BC_C78C();
    // mainCode.isUnknownDC2BZero_01ED_ABCC_CA9C();
    // mainCode.isUnknownDBC8And1/check_pcm_enabled_ida_01ED_AE2F_CCFF();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xABA9, "unknown") { unknown_01ED_ABA9_CA79() }
  fun unknown_01ED_ABA9_CA79(): Runnable {
    // mainCode.isUnknownDBC8And1/check_pcm_enabled_ida_01ED_AE2F_CCFF();

    return nearRet()
  }

  // Not providing stub for mainCode.isUnknownDC2BZero. Reason: Function already has an override

  // defineFunction(0x1ED, 0xABD5, "unknown") { unknown_01ED_ABD5_CAA5() }
  fun unknown_01ED_ABD5_CAA5(): Runnable {
    // mainCode.isUnknownDC2BZero_01ED_ABCC_CA9C();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xAC14, "pcm_stop_voc_q_ida") { pcm_stop_voc_q_ida_01ED_AC14_CAE4() }
  fun pcm_stop_voc_q_ida_01ED_AC14_CAE4(): Runnable {
    // ida.close_res_file_handle_ida_01ED_A9A1_C871();
    // unknown_01ED_DA5F_F92F();
    // soundDriverPcSpeaker.clearAL_4822_0109_8329();

    return nearRet()
  }

  // Not providing stub for sound.soundDriverUnknownClearAL/call_pcm_audio_vtable_func_5_ida. Reason: Function already has an override

  // defineFunction(0x1ED, 0xAC3A, "unknown") { unknown_01ED_AC3A_CB0A() }
  fun unknown_01ED_AC3A_CB0A(): Runnable {
    // mainCode.isUnknownDBC80x100_01ED_AE28_CCF8();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xACE6, "unknown") { unknown_01ED_ACE6_CBB6() }
  fun unknown_01ED_ACE6_CBB6(): Runnable {
    // mainCode.isUnknownDC2BZero_01ED_ABCC_CA9C();
    // ida.load_music_ida_01ED_AE62_CD32();
    // mainCode.isUnknownDBC80x100And2943BitmaskNonZero_01ED_AEC6_CD96();
    // unknown_482B_0103_83B3();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xAD43, "unknown") { unknown_01ED_AD43_CC13() }
  fun unknown_01ED_AD43_CC13(): Runnable {
    // ida.load_music_ida_01ED_AE62_CD32();
    // mainCode.isUnknownDBC80x100And2943BitmaskNonZero_01ED_AEC6_CD96();
    // unknown_482B_0103_83B3();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xAD50, "unknown") { unknown_01ED_AD50_CC20() }
  fun unknown_01ED_AD50_CC20(): Runnable {
    // ida.load_music_ida_01ED_AE62_CD32();
    // sound.checkSoundPresent/midi_func_2_0_ida_01ED_AEB7_CD87();
    // mainCode.isUnknownDBC80x100And2943BitmaskNonZero_01ED_AEC6_CD96();
    // unknown_482B_0103_83B3();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xAD57, "play_music_MORNING_HSQ_ida") { play_music_MORNING_HSQ_ida_01ED_AD57_CC27() }
  fun play_music_MORNING_HSQ_ida_01ED_AD57_CC27(): Runnable {
    // ida.load_music_ida_01ED_AE62_CD32();
    // sound.checkSoundPresent/midi_func_2_0_ida_01ED_AEB7_CD87();
    // mainCode.isUnknownDBC80x100And2943BitmaskNonZero_01ED_AEC6_CD96();
    // unknown_482B_0103_83B3();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xAD5E, "unknown") { unknown_01ED_AD5E_CC2E() }
  fun unknown_01ED_AD5E_CC2E(): Runnable {
    // unknown_01ED_AA96_C966();
    // mainCode.isUnknownDBC80x100And2943BitmaskNonZero_01ED_AEC6_CD96();
    // unknown_482B_0109_83B9();
    // unknown_482B_010C_83BC();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xADBE, "unknown") { unknown_01ED_ADBE_CC8E() }
  fun unknown_01ED_ADBE_CC8E(): Runnable {
    // mainCode.isUnknownDBC80x100And2943BitmaskNonZero_01ED_AEC6_CD96();
    // unknown_482B_010C_83BC();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xADE0, "unknown") { unknown_01ED_ADE0_CCB0() }
  fun unknown_01ED_ADE0_CCB0(): Runnable {
    // unknown_482B_010C_83BC();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xADED, "unknown") { unknown_01ED_ADED_CCBD() }
  fun unknown_01ED_ADED_CCBD(): Runnable {
    // unknown_482B_010C_83BC();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xAE04, "unknown") { unknown_01ED_AE04_CCD4() }
  fun unknown_01ED_AE04_CCD4(): Runnable {
    // unknown_01ED_AD43_CC13();
    // mainCode.isUnknownDBC80x100And2943BitmaskNonZero_01ED_AEC6_CD96();
    // display.pushAll_01ED_E270_0140();
    // display.popAll_01ED_E283_0153();

    return nearRet()
  }

  // Not providing stub for mainCode.isUnknownDBC80x100. Reason: Function already has an override

  // Not providing stub for mainCode.isUnknownDBC8And1/check_pcm_enabled_ida. Reason: Function already has an override

  // defineFunction(0x1ED, 0xAE3F, "unknown") { unknown_01ED_AE3F_CD0F() }
  fun unknown_01ED_AE3F_CD0F(): Runnable {
    // mainCode.isUnknownDBC80x100_01ED_AE28_CCF8();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xAE54, "unknown") { unknown_01ED_AE54_CD24() }
  fun unknown_01ED_AE54_CD24(): Runnable {
    // mainCode.isUnknownDBC8And1/check_pcm_enabled_ida_01ED_AE2F_CCFF();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xAE62, "load_music_ida") { load_music_ida_01ED_AE62_CD32() }
  fun load_music_ida_01ED_AE62_CD32(): Runnable {
    // sound.checkSoundPresent/midi_func_2_0_ida_01ED_AEB7_CD87();
    // ida.open_resource_by_index_si_ida_01ED_F0B9_0F89();

    return nearRet()
  }

  // Not providing stub for sound.checkSoundPresent/midi_func_2_0_ida. Reason: Function already has an override

  // Not providing stub for mainCode.isUnknownDBC80x100And2943BitmaskNonZero. Reason: Function already has an override

  // defineFunction(0x1ED, 0xAED6, "unknown") { unknown_01ED_AED6_CDA6() }
  fun unknown_01ED_AED6_CDA6(): Runnable {
    // unknown_01ED_181E_36EE();
    // unknown_01ED_18BA_378A();
    // unknown_01ED_AD43_CC13();
    // unknown_01ED_AD5E_CC2E();
    // mainCode.isUnknownDBC80x100And2943BitmaskNonZero_01ED_AEC6_CD96();
    // mainCode.inc2788_01ED_B2B9_D189();
    // ida.transition_ida_01ED_C108_DFD8();
    // map.setMapClickHandlerAddressToInGame_01ED_D95B_F82B();
    // map.initMapCursorTypeDC58To0_01ED_DAA3_F973();
    // display.pushAll_01ED_E270_0140();
    // display.popAll_01ED_E283_0153();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xAF00, "unknown") { unknown_01ED_AF00_CDD0() }
  fun unknown_01ED_AF00_CDD0(): Runnable {
    // unknown_01ED_B147_D017();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xAF26, "unknown") { unknown_01ED_AF26_CDF6() }
  fun unknown_01ED_AF26_CDF6(): Runnable {
    // unknown_01ED_AF00_CDD0();
    // ida.load_icons_sprites_ida_01ED_C137_E007();
    // unknown_01ED_C1AA_E07A();
    // ida.draw_sprite_ida_01ED_C22F_E0FF();
    // unknown_01ED_C2F2_E1C2();
    // unknown_01ED_C432_E302();
    // unknown_01ED_D33A_F20A();
    // unknown_01ED_D72B_F5FB();
    // unknown_01ED_D7AD_F67D();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xAF43, "unknown") { unknown_01ED_AF43_CE13() }
  fun unknown_01ED_AF43_CE13(): Runnable {
    // ida.load_icons_sprites_ida_01ED_C137_E007();
    // unknown_01ED_C1AA_E07A();
    // ida.draw_sprite_ida_01ED_C22F_E0FF();
    // unknown_01ED_C2F2_E1C2();
    // unknown_01ED_C432_E302();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB024, "unknown") { unknown_01ED_B024_CEF4() }
  fun unknown_01ED_B024_CEF4(): Runnable {
    // ida.audio_start_voc_ida_01ED_AB15_C9E5();
    // ida.pcm_stop_voc_q_ida_01ED_AC14_CAE4();
    // unknown_01ED_B1AF_D07F();
    // ida.gfx_call_bp_with_front_buffer_as_screen_ida_01ED_C097_DF67();
    // ida.gfx_copy_framebuf_to_screen_ida_01ED_C4CD_E39D();
    // unknown_2538_0151_54D1();
    // unknown_2538_0160_54E0();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB02C, "unknown") { unknown_01ED_B02C_CEFC() }
  fun unknown_01ED_B02C_CEFC(): Runnable {
    // ida.audio_start_voc_ida_01ED_AB15_C9E5();
    // ida.pcm_stop_voc_q_ida_01ED_AC14_CAE4();
    // ida.gfx_call_bp_with_front_buffer_as_screen_ida_01ED_C097_DF67();
    // ida.gfx_copy_framebuf_to_screen_ida_01ED_C4CD_E39D();
    // unknown_2538_0151_54D1();
    // unknown_2538_0160_54E0();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB039, "unknown") { unknown_01ED_B039_CF09() }
  fun unknown_01ED_B039_CF09(): Runnable {
    // unknown_01ED_1797_3667();
    // unknown_01ED_88E1_A7B1();
    // unknown_01ED_B126_CFF6();
    // unknown_01ED_B254_D124();
    // ida.open_sprite_sheet_ida_01ED_C13E_E00E();
    // unknown_01ED_C21B_E0EB();
    // ida.draw_sprite_ida_01ED_C22F_E0FF();
    // unknown_01ED_C551_E421();
    // unknown_01ED_D04E_EF1E();
    // unknown_01ED_D12F_EFFF();
    // unknown_01ED_D194_F064();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB126, "unknown") { unknown_01ED_B126_CFF6() }
  fun unknown_01ED_B126_CFF6(): Runnable {
    // unknown_01ED_88F1_A7C1();
    // unknown_01ED_8944_A814();
    // unknown_01ED_CF70_EE40();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB147, "unknown") { unknown_01ED_B147_D017() }
  fun unknown_01ED_B147_D017(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB150, "unknown") { unknown_01ED_B150_D020() }
  fun unknown_01ED_B150_D020(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB17A, "unknown") { unknown_01ED_B17A_D04A() }
  fun unknown_01ED_B17A_D04A(): Runnable {
    // unknown_01ED_96B5_B585();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB1AF, "unknown") { unknown_01ED_B1AF_D07F() }
  fun unknown_01ED_B1AF_D07F(): Runnable {
    // display.setTextVideoBufferSegmentDBD8/set_screen_as_active_framebuffer_ida_01ED_C08E_DF5E();
    // ida.load_icons_sprites_ida_01ED_C137_E007();
    // ida.draw_sprite_ida_01ED_C22F_E0FF();
    // unknown_01ED_C2FD_E1CD();
    // unknown_01ED_D1F2_F0C2();
    // unknown_01ED_E387_0257();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB1EE, "unknown") { unknown_01ED_B1EE_D0BE() }
  fun unknown_01ED_B1EE_D0BE(): Runnable {
    // ida.pcm_stop_voc_q_ida_01ED_AC14_CAE4();
    // sound.checkSoundPresent/midi_func_2_0_ida_01ED_AEB7_CD87();
    // display.setVideoBufferSegmentDBD6/set_frontbuffer_as_active_framebuffer_ida_01ED_C07C_DF4C();
    // display.setTextVideoBufferSegmentDBD8/set_screen_as_active_framebuffer_ida_01ED_C08E_DF5E();
    // ida.transition_ida_01ED_C108_DFD8();
    // unknown_01ED_C412_E2E2();
    // ida.hnm_do_frame_skippable_ida_01ED_C9E8_E8B8();
    // ida.hnm_close_resource_ida_01ED_CA01_E8D1();
    // video.isLastFrame/check_if_hnm_complete_ida_01ED_CC85_EB55();
    // mainCode.setCEE8To0_01ED_DE4E_FD1E();
    // vgaDriver.copyPalette2toPalette1_2538_017B_54FB();
    // unknown_2538_0187_5507();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB236, "unknown") { unknown_01ED_B236_D106() }
  fun unknown_01ED_B236_D106(): Runnable {
    // ida.decode_sd_block_ida_01ED_AA0F_C8DF();
    // display.clearCurrentVideoBuffer/gfx_clear_frame_buffer_ida_01ED_C0AD_DF7D();
    // ida.hnm_reset_and_read_header_ida_01ED_C92B_E7FB();
    // unknown_01ED_CB1A_E9EA();
    // ida.hnm_decode_video_frame_ida_01ED_CC96_EB66();
    // unknown_01ED_CCF4_EBC4();
    // ida.hnm_prepare_header_read_ida_01ED_CDA0_EC70();
    // ida.hnm_reset_ida_01ED_CE1A_ECEA();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB23F, "unknown") { unknown_01ED_B23F_D10F() }
  fun unknown_01ED_B23F_D10F(): Runnable {
    // unknown_01ED_B039_CF09();
    // display.clearCurrentVideoBuffer/gfx_clear_frame_buffer_ida_01ED_C0AD_DF7D();
    // unknown_01ED_D1F2_F0C2();
    // unknown_01ED_D397_F267();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB254, "unknown") { unknown_01ED_B254_D124() }
  fun unknown_01ED_B254_D124(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB2B3, "unknown") { unknown_01ED_B2B3_D183() }
  fun unknown_01ED_B2B3_D183(): Runnable {

    return nearRet()
  }

  // Not providing stub for mainCode.inc2788. Reason: Function already has an override

  // Not providing stub for mainCode.setUnknown2788To0. Reason: Function already has an override

  // defineFunction(0x1ED, 0xB2C4, "unknown") { unknown_01ED_B2C4_D194() }
  fun unknown_01ED_B2C4_D194(): Runnable {
    // unknown_01ED_CF70_EE40();
    // unknown_01ED_D03C_EF0C();
    // display.pushAll_01ED_E270_0140();
    // display.popAll_01ED_E283_0153();
    // unknown_01ED_E2E3_01B3();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB30F, "unknown") { unknown_01ED_B30F_D1DF() }
  fun unknown_01ED_B30F_D1DF(): Runnable {
    // unknown_01ED_B2C4_D194();
    // ida.strcpy_to_filename_buf_ida_01ED_F2FC_11CC();
    // providedInterrupts.provided_interrupt_handler_0x21_F000_0028_0028();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB389, "open_sav_cl_ida") { open_sav_cl_ida_01ED_B389_D259() }
  fun open_sav_cl_ida_01ED_B389_D259(): Runnable {
    // ida.map_func_ida_01ED_B427_D2F7();
    // unknown_01ED_B4EA_D3BA();
    // ida.strcpy_to_filename_buf_ida_01ED_F2FC_11CC();
    // providedInterrupts.provided_interrupt_handler_0x21_F000_0028_0028();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB427, "map_func_ida") { map_func_ida_01ED_B427_D2F7() }
  fun map_func_ida_01ED_B427_D2F7(): Runnable {
    // ida.alloc_cx_pages_to_di_ida_01ED_F11C_0FEC();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB473, "unknown") { unknown_01ED_B473_D343() }
  fun unknown_01ED_B473_D343(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB4BB, "unknown") { unknown_01ED_B4BB_D38B() }
  fun unknown_01ED_B4BB_D38B(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB4EA, "unknown") { unknown_01ED_B4EA_D3BA() }
  fun unknown_01ED_B4EA_D3BA(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB532, "unknown") { unknown_01ED_B532_D402() }
  fun unknown_01ED_B532_D402(): Runnable {
    // ida.map_func_ida_01ED_B58B_D45B();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB53B, "unknown") { unknown_01ED_B53B_D40B() }
  fun unknown_01ED_B53B_D40B(): Runnable {
    // ida.map_func_ida_01ED_B58B_D45B();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB56C, "unknown") { unknown_01ED_B56C_D43C() }
  fun unknown_01ED_B56C_D43C(): Runnable {
    // unknown_01ED_B53B_D40B();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB58B, "map_func_ida") { map_func_ida_01ED_B58B_D45B() }
  fun map_func_ida_01ED_B58B_D45B(): Runnable {
    // unknown_01ED_B5A0_D470();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB5A0, "unknown") { unknown_01ED_B5A0_D470() }
  fun unknown_01ED_B5A0_D470(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB5C5, "unknown") { unknown_01ED_B5C5_D495() }
  fun unknown_01ED_B5C5_D495(): Runnable {
    // ida.map_func_ida_01ED_B58B_D45B();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB647, "unknown") { unknown_01ED_B647_D517() }
  fun unknown_01ED_B647_D517(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB683, "unknown") { unknown_01ED_B683_D553() }
  fun unknown_01ED_B683_D553(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB6C3, "map_func_ida") { map_func_ida_01ED_B6C3_D593() }
  fun map_func_ida_01ED_B6C3_D593(): Runnable {
    // unknown_01ED_B7D2_D6A2();
    // unknown_2538_0142_54C2();
    // unknown_2538_0157_54D7();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB7D2, "unknown") { unknown_01ED_B7D2_D6A2() }
  fun unknown_01ED_B7D2_D6A2(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB827, "unknown") { unknown_01ED_B827_D6F7() }
  fun unknown_01ED_B827_D6F7(): Runnable {
    // unknown_01ED_1797_3667();
    // unknown_01ED_AA96_C966();
    // mainCode.isUnknownDBC80x100And2943BitmaskNonZero_01ED_AEC6_CD96();
    // unknown_01ED_B84A_D71A();
    // unknown_01ED_B87E_D74E();
    // unknown_01ED_B941_D811();
    // unknown_01ED_D72B_F5FB();
    // unknown_01ED_D7B2_F682();
    // unknown_482B_010C_83BC();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB84A, "unknown") { unknown_01ED_B84A_D71A() }
  fun unknown_01ED_B84A_D71A(): Runnable {
    // mainCode.memCopy8BytesDsSIToDsDi_01ED_5B99_7A69();
    // display.setVideoBufferSegmentDBD6/set_frontbuffer_as_active_framebuffer_ida_01ED_C07C_DF4C();
    // ida.open_sprite_sheet_ida_01ED_C13E_E00E();
    // ida.draw_sprite_ida_01ED_C22F_E0FF();
    // map.setSiToMapCursorTypeDC58_01ED_DAAA_F97A();
    // unknown_2538_011E_549E();
    // unknown_2538_0145_54C5();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB85A, "unknown") { unknown_01ED_B85A_D72A() }
  fun unknown_01ED_B85A_D72A(): Runnable {
    // mainCode.memCopy8BytesDsSIToDsDi_01ED_5B99_7A69();
    // ida.open_sprite_sheet_ida_01ED_C13E_E00E();
    // ida.draw_sprite_ida_01ED_C22F_E0FF();
    // map.setSiToMapCursorTypeDC58_01ED_DAAA_F97A();
    // unknown_2538_0145_54C5();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB87E, "unknown") { unknown_01ED_B87E_D74E() }
  fun unknown_01ED_B87E_D74E(): Runnable {
    // mainCode.memCopy8Bytes_01ED_5BA8_7A78();
    // ida.open_sprite_sheet_ida_01ED_C13E_E00E();
    // unknown_01ED_C305_E1D5();
    // unknown_01ED_C30D_E1DD();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB8A7, "unknown") { unknown_01ED_B8A7_D777() }
  fun unknown_01ED_B8A7_D777(): Runnable {
    // unknown_01ED_BA75_D945();
    // ida.open_sprite_sheet_ida_01ED_C13E_E00E();
    // ida.open_resource_by_index_si_ida_01ED_F0B9_0F89();
    // unknown_2538_0160_54E0();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB8C6, "unknown") { unknown_01ED_B8C6_D796() }
  fun unknown_01ED_B8C6_D796(): Runnable {
    // unknown_01ED_17E6_36B6();
    // unknown_01ED_5ADF_79AF();
    // unknown_01ED_AE04_CCD4();
    // unknown_01ED_B8A7_D777();
    // ida.transition_ida_01ED_C108_DFD8();
    // unknown_01ED_D2BD_F18D();
    // map.setMapClickHandlerAddressFromAx_01ED_D95E_F82E();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB8EA, "unknown") { unknown_01ED_B8EA_D7BA() }
  fun unknown_01ED_B8EA_D7BA(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB8F3, "unknown") { unknown_01ED_B8F3_D7C3() }
  fun unknown_01ED_B8F3_D7C3(): Runnable {
    // unknown_01ED_B84A_D71A();
    // unknown_01ED_B87E_D74E();
    // ida.gfx_call_bp_with_front_buffer_as_screen_ida_01ED_C097_DF67();
    // unknown_01ED_C43E_E30E();
    // unknown_01ED_C474_E344();
    // unknown_01ED_C4DD_E3AD();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB930, "unknown") { unknown_01ED_B930_D800() }
  fun unknown_01ED_B930_D800(): Runnable {
    // unknown_01ED_DA5F_F92F();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB941, "unknown") { unknown_01ED_B941_D811() }
  fun unknown_01ED_B941_D811(): Runnable {
    // mainCode.setBpToCurrentMenuTypeForScreenAction_01ED_D41B_F2EB();
    // unknown_01ED_D48A_F35A();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB96B, "unknown") { unknown_01ED_B96B_D83B() }
  fun unknown_01ED_B96B_D83B(): Runnable {
    // unknown_01ED_B2B3_D183();
    // unknown_01ED_B8F3_D7C3();
    // unknown_01ED_B98B_D85B();
    // mainCode.setBpToCurrentMenuTypeForScreenAction_01ED_D41B_F2EB();
    // mainCode.dispatcherHelperDeterminesWhereToJump_01ED_D454_F324();
    // unknown_01ED_D48A_F35A();
    // ida.call_restore_cursor_ida_01ED_DBB2_FA82();
    // ida.draw_mouse_ida_01ED_DBEC_FABC();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB977, "map_func_gfx_ida") { map_func_gfx_ida_01ED_B977_D847() }
  fun map_func_gfx_ida_01ED_B977_D847(): Runnable {
    // unknown_2538_0145_54C5();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB98B, "unknown") { unknown_01ED_B98B_D85B() }
  fun unknown_01ED_B98B_D85B(): Runnable {
    // ida.map_func_gfx_ida_01ED_B977_D847();
    // unknown_01ED_BAF2_D9C2();
    // unknown_01ED_BC0C_DADC();
    // unknown_01ED_C4ED_E3BD();
    // unknown_01ED_DB67_FA37();
    // unknown_01ED_DB74_FA44();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB9AE, "unknown") { unknown_01ED_B9AE_D87E() }
  fun unknown_01ED_B9AE_D87E(): Runnable {
    // unknown_01ED_BAF2_D9C2();
    // unknown_01ED_BC0C_DADC();
    // unknown_01ED_C4ED_E3BD();
    // unknown_01ED_DB67_FA37();
    // unknown_01ED_DB74_FA44();
    // unknown_2538_0148_54C8();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB9E0, "unknown") { unknown_01ED_B9E0_D8B0() }
  fun unknown_01ED_B9E0_D8B0(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xB9F6, "unknown") { unknown_01ED_B9F6_D8C6() }
  fun unknown_01ED_B9F6_D8C6(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xBA15, "unknown") { unknown_01ED_BA15_D8E5() }
  fun unknown_01ED_BA15_D8E5(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xBA75, "unknown") { unknown_01ED_BA75_D945() }
  fun unknown_01ED_BA75_D945(): Runnable {
    // unknown_01ED_B9F6_D8C6();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xBA9E, "unknown") { unknown_01ED_BA9E_D96E() }
  fun unknown_01ED_BA9E_D96E(): Runnable {
    // unknown_01ED_407E_5F4E();
    // unknown_01ED_B683_D553();
    // unknown_01ED_B98B_D85B();
    // unknown_01ED_B9E0_D8B0();
    // unknown_01ED_BA15_D8E5();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xBAF2, "unknown") { unknown_01ED_BAF2_D9C2() }
  fun unknown_01ED_BAF2_D9C2(): Runnable {
    // unknown_01ED_407E_5F4E();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xBC0C, "unknown") { unknown_01ED_BC0C_DADC() }
  fun unknown_01ED_BC0C_DADC(): Runnable {
    // display.setTextVideoBufferSegmentDBD8/set_screen_as_active_framebuffer_ida_01ED_C08E_DF5E();
    // ida.load_icons_sprites_ida_01ED_C137_E007();
    // datastructures.getEsSiPointerToUnknown_01ED_C1F4_E0C4();
    // vgaDriver.blit_2538_010F_548F();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xBC1F, "unknown") { unknown_01ED_BC1F_DAEF() }
  fun unknown_01ED_BC1F_DAEF(): Runnable {
    // unknown_01ED_BC4E_DB1E();
    // mainCode.setBpToCurrentMenuTypeForScreenAction_01ED_D41B_F2EB();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xBC4E, "unknown") { unknown_01ED_BC4E_DB1E() }
  fun unknown_01ED_BC4E_DB1E(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xBC99, "unknown") { unknown_01ED_BC99_DB69() }
  fun unknown_01ED_BC99_DB69(): Runnable {
    // unknown_01ED_BD00_DBD0();
    // display.setTextVideoBufferSegmentDBD8/set_screen_as_active_framebuffer_ida_01ED_C08E_DF5E();
    // unknown_01ED_C551_E421();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xBD00, "unknown") { unknown_01ED_BD00_DBD0() }
  fun unknown_01ED_BD00_DBD0(): Runnable {
    // unknown_01ED_C0D5_DFA5();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xBDFA, "unknown") { unknown_01ED_BDFA_DCCA() }
  fun unknown_01ED_BDFA_DCCA(): Runnable {
    // time.getSunlightDay_01ED_1AD1_39A1();
    // unknown_01ED_BFA7_DE77();
    // display.setFontToIntro_01ED_D068_EF38();
    // unknown_01ED_D194_F064();
    // unknown_01ED_E2DB_01AB();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xBE1D, "unknown") { unknown_01ED_BE1D_DCED() }
  fun unknown_01ED_BE1D_DCED(): Runnable {
    // unknown_01ED_BDFA_DCCA();
    // unknown_01ED_BED7_DDA7();
    // display.setTextVideoBufferSegmentDBD8/set_screen_as_active_framebuffer_ida_01ED_C08E_DF5E();
    // ida.load_icons_sprites_ida_01ED_C137_E007();
    // ida.open_sprite_sheet_ida_01ED_C13E_E00E();
    // unknown_01ED_C21B_E0EB();
    // unknown_01ED_C2FD_E1CD();
    // display.setFontToMenu_01ED_D075_EF45();
    // unknown_01ED_D1A6_F076();
    // unknown_01ED_DA25_F8F5();
    // unknown_01ED_DB74_FA44();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xBE57, "unknown") { unknown_01ED_BE57_DD27() }
  fun unknown_01ED_BE57_DD27(): Runnable {
    // display.setTextVideoBufferSegmentDBD8/set_screen_as_active_framebuffer_ida_01ED_C08E_DF5E();
    // ida.load_icons_sprites_ida_01ED_C137_E007();
    // unknown_01ED_C2FD_E1CD();
    // unknown_01ED_D04E_EF1E();
    // unknown_01ED_D12F_EFFF();
    // unknown_01ED_DB74_FA44();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xBED7, "unknown") { unknown_01ED_BED7_DDA7() }
  fun unknown_01ED_BED7_DDA7(): Runnable {
    // unknown_01ED_BF26_DDF6();
    // unknown_01ED_C02E_DEFE();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xBF26, "unknown") { unknown_01ED_BF26_DDF6() }
  fun unknown_01ED_BF26_DDF6(): Runnable {
    // unknown_01ED_BF61_DE31();
    // unknown_01ED_BF73_DE43();
    // unknown_01ED_CF70_EE40();
    // unknown_01ED_D03C_EF0C();
    // unknown_01ED_E31C_01EC();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xBF61, "unknown") { unknown_01ED_BF61_DE31() }
  fun unknown_01ED_BF61_DE31(): Runnable {
    // unknown_01ED_D03C_EF0C();
    // unknown_01ED_E31C_01EC();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xBF73, "unknown") { unknown_01ED_BF73_DE43() }
  fun unknown_01ED_BF73_DE43(): Runnable {
    // unknown_01ED_D03C_EF0C();
    // unknown_01ED_E2E3_01B3();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xBFA7, "unknown") { unknown_01ED_BFA7_DE77() }
  fun unknown_01ED_BFA7_DE77(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xBFE3, "map_func_ida") { map_func_ida_01ED_BFE3_DEB3() }
  fun map_func_ida_01ED_BFE3_DEB3(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC02E, "unknown") { unknown_01ED_C02E_DEFE() }
  fun unknown_01ED_C02E_DEFE(): Runnable {
    // ida.map_func_ida_01ED_BFE3_DEB3();

    return nearRet()
  }

  // Not providing stub for display.setVideoBufferSegmentDBD6/set_frontbuffer_as_active_framebuffer_ida. Reason: Function already has an override

  // Not providing stub for display.setDialogueVideoBufferSegmentDC32/set_backbuffer_as_frame_buffer_ida. Reason: Function already has an override

  // Not providing stub for display.setTextVideoBufferSegmentDBD8/set_screen_as_active_framebuffer_ida. Reason: Function already has an override

  // defineFunction(0x1ED, 0xC097, "gfx_call_bp_with_front_buffer_as_screen_ida") { gfx_call_bp_with_front_buffer_as_screen_ida_01ED_C097_DF67() }
  fun gfx_call_bp_with_front_buffer_as_screen_ida_01ED_C097_DF67(): Runnable {
    // unknown_01ED_02C1_2191();
    // ida.load_VIRGIN_HNM_ida_01ED_061C_24EC();
    // ida.play_CREDITS_HNM_ida_01ED_09EF_28BF();
    // mainCode.noOp_01ED_0F66_2E36();
    // unknown_01ED_2DB1_4C81();
    // unknown_01ED_2EB2_4D82();
    // unknown_01ED_5A56_7926();
    // unknown_01ED_AF26_CDF6();
    // unknown_01ED_AF43_CE13();
    // unknown_01ED_B039_CF09();
    // unknown_01ED_B236_D106();
    // unknown_01ED_B23F_D10F();
    // unknown_01ED_B827_D6F7();
    // unknown_01ED_BE1D_DCED();
    // display.setVideoBufferSegmentDBD6/set_frontbuffer_as_active_framebuffer_ida_01ED_C07C_DF4C();
    // unknown_01ED_D1EF_F0BF();
    // unknown_01ED_D717_F5E7();
    // unknown_01ED_D75A_F62A();

    return nearRet()
  }

  // Not providing stub for display.clearCurrentVideoBuffer/gfx_clear_frame_buffer_ida. Reason: Function already has an override

  // defineFunction(0x1ED, 0xC0D5, "unknown") { unknown_01ED_C0D5_DFA5() }
  fun unknown_01ED_C0D5_DFA5(): Runnable {
    // unknown_2538_015A_54DA();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC0E8, "unknown") { unknown_01ED_C0E8_DFB8() }
  fun unknown_01ED_C0E8_DFB8(): Runnable {
    // unknown_2538_015A_54DA();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC0F4, "unknown") { unknown_01ED_C0F4_DFC4() }
  fun unknown_01ED_C0F4_DFC4(): Runnable {
    // unknown_2538_0160_54E0();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC102, "unknown") { unknown_01ED_C102_DFD2() }
  fun unknown_01ED_C102_DFD2(): Runnable {
    // ida.gfx_call_bp_with_front_buffer_as_screen_ida_01ED_C097_DF67();
    // ida.gfx_copy_framebuf_to_screen_ida_01ED_C4CD_E39D();
    // unknown_2538_0151_54D1();
    // unknown_2538_0160_54E0();
    // vgaDriver.copyPalette2toPalette1_2538_017B_54FB();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC108, "transition_ida") { transition_ida_01ED_C108_DFD8() }
  fun transition_ida_01ED_C108_DFD8(): Runnable {
    // ida.gfx_call_bp_with_front_buffer_as_screen_ida_01ED_C097_DF67();
    // ida.gfx_copy_framebuf_to_screen_ida_01ED_C4CD_E39D();
    // unknown_2538_0151_54D1();
    // unknown_2538_0160_54E0();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC137, "load_icons_sprites_ida") { load_icons_sprites_ida_01ED_C137_E007() }
  fun load_icons_sprites_ida_01ED_C137_E007(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC13B, "unknown") { unknown_01ED_C13B_E00B() }
  fun unknown_01ED_C13B_E00B(): Runnable {
    // unknown_01ED_C1AA_E07A();
    // ida.open_resource_by_index_si_ida_01ED_F0B9_0F89();
    // vgaDriver.noOp_2538_013C_54BC();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC13E, "open_sprite_sheet_ida") { open_sprite_sheet_ida_01ED_C13E_E00E() }
  fun open_sprite_sheet_ida_01ED_C13E_E00E(): Runnable {
    // unknown_01ED_C1AA_E07A();
    // ida.open_resource_by_index_si_ida_01ED_F0B9_0F89();
    // vgaDriver.noOp_2538_013C_54BC();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC1AA, "unknown") { unknown_01ED_C1AA_E07A() }
  fun unknown_01ED_C1AA_E07A(): Runnable {
    // unknown_2538_0106_5486();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC1BA, "hnm_apply_palette_ida") { hnm_apply_palette_ida_01ED_C1BA_E08A() }
  fun hnm_apply_palette_ida_01ED_C1BA_E08A(): Runnable {
    // unknown_2538_0106_5486();

    return nearRet()
  }

  // Not providing stub for datastructures.getEsSiPointerToUnknown. Reason: Function already has an override

  // defineFunction(0x1ED, 0xC202, "unknown") { unknown_01ED_C202_E0D2() }
  fun unknown_01ED_C202_E0D2(): Runnable {
    // datastructures.getEsSiPointerToUnknown_01ED_C1F4_E0C4();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC21B, "unknown") { unknown_01ED_C21B_E0EB() }
  fun unknown_01ED_C21B_E0EB(): Runnable {
    // ida.draw_sprite_ida_01ED_C22F_E0FF();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC22F, "draw_sprite_ida") { draw_sprite_ida_01ED_C22F_E0FF() }
  fun draw_sprite_ida_01ED_C22F_E0FF(): Runnable {
    // unknown_01ED_C2A1_E171();
    // vgaDriver.blit_2538_010F_548F();
    // unknown_2538_0169_54E9();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC2A1, "unknown") { unknown_01ED_C2A1_E171() }
  fun unknown_01ED_C2A1_E171(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC2F2, "unknown") { unknown_01ED_C2F2_E1C2() }
  fun unknown_01ED_C2F2_E1C2(): Runnable {
    // ida.open_sprite_sheet_ida_01ED_C13E_E00E();
    // ida.draw_sprite_ida_01ED_C22F_E0FF();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC2FD, "unknown") { unknown_01ED_C2FD_E1CD() }
  fun unknown_01ED_C2FD_E1CD(): Runnable {
    // ida.draw_sprite_ida_01ED_C22F_E0FF();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC305, "unknown") { unknown_01ED_C305_E1D5() }
  fun unknown_01ED_C305_E1D5(): Runnable {
    // unknown_01ED_C30D_E1DD();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC30D, "unknown") { unknown_01ED_C30D_E1DD() }
  fun unknown_01ED_C30D_E1DD(): Runnable {
    // unknown_2538_0112_5492();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC343, "unknown") { unknown_01ED_C343_E213() }
  fun unknown_01ED_C343_E213(): Runnable {
    // unknown_2538_0112_5492();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC370, "unknown") { unknown_01ED_C370_E240() }
  fun unknown_01ED_C370_E240(): Runnable {
    // vgaDriver.blit_2538_010F_548F();
    // unknown_2538_011B_549B();
    // unknown_2538_015D_54DD();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC412, "unknown") { unknown_01ED_C412_E2E2() }
  fun unknown_01ED_C412_E2E2(): Runnable {
    // vgaDriver.memcpyDSToESFor64000_2538_0121_54A1();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC432, "unknown") { unknown_01ED_C432_E302() }
  fun unknown_01ED_C432_E302(): Runnable {
    // unknown_2538_011B_549B();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC43E, "unknown") { unknown_01ED_C43E_E30E() }
  fun unknown_01ED_C43E_E30E(): Runnable {
    // vgaDriver.copySquareOfPixelsSiIsSourceSegment_2538_012A_54AA();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC443, "unknown") { unknown_01ED_C443_E313() }
  fun unknown_01ED_C443_E313(): Runnable {
    // vgaDriver.copySquareOfPixelsSiIsSourceSegment_2538_012A_54AA();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC446, "unknown") { unknown_01ED_C446_E316() }
  fun unknown_01ED_C446_E316(): Runnable {
    // vgaDriver.copySquareOfPixelsSiIsSourceSegment_2538_012A_54AA();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC46F, "unknown") { unknown_01ED_C46F_E33F() }
  fun unknown_01ED_C46F_E33F(): Runnable {
    // vgaDriver.copySquareOfPixelsSiIsSourceSegment_2538_012A_54AA();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC474, "unknown") { unknown_01ED_C474_E344() }
  fun unknown_01ED_C474_E344(): Runnable {
    // vgaDriver.copyRectangle_2538_0124_54A4();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC477, "gfx_copy_rect_at_si_ida") { gfx_copy_rect_at_si_ida_01ED_C477_E347() }
  fun gfx_copy_rect_at_si_ida_01ED_C477_E347(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC4AA, "gfx_copy_rect_to_screen_ida") { gfx_copy_rect_to_screen_ida_01ED_C4AA_E37A() }
  fun gfx_copy_rect_to_screen_ida_01ED_C4AA_E37A(): Runnable {
    // vgaDriver.copySquareOfPixels_2538_0130_54B0();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC4CD, "gfx_copy_framebuf_to_screen_ida") { gfx_copy_framebuf_to_screen_ida_01ED_C4CD_E39D() }
  fun gfx_copy_framebuf_to_screen_ida_01ED_C4CD_E39D(): Runnable {
    // vgaDriver.memcpyDSToESFor64000_2538_012D_54AD();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC4DD, "unknown") { unknown_01ED_C4DD_E3AD() }
  fun unknown_01ED_C4DD_E3AD(): Runnable {
    // unknown_01ED_1797_3667();
    // ida.call_restore_cursor_ida_01ED_DBB2_FA82();
    // vgaDriver.copySquareOfPixels_2538_0130_54B0();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC4ED, "unknown") { unknown_01ED_C4ED_E3BD() }
  fun unknown_01ED_C4ED_E3BD(): Runnable {
    // vgaDriver.copySquareOfPixels_2538_0130_54B0();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC4F0, "rect_at_si_to_regs_ida") { rect_at_si_to_regs_ida_01ED_C4F0_E3C0() }
  fun rect_at_si_to_regs_ida_01ED_C4F0_E3C0(): Runnable {
    // unknown_01ED_1797_3667();
    // vgaDriver.copySquareOfPixels_2538_0130_54B0();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC4FB, "unknown") { unknown_01ED_C4FB_E3CB() }
  fun unknown_01ED_C4FB_E3CB(): Runnable {
    // vgaDriver.copySquareOfPixels_2538_0130_54B0();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC51E, "unknown") { unknown_01ED_C51E_E3EE() }
  fun unknown_01ED_C51E_E3EE(): Runnable {
    // vgaDriver.copySquareOfPixels_2538_0130_54B0();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC53E, "unknown") { unknown_01ED_C53E_E40E() }
  fun unknown_01ED_C53E_E40E(): Runnable {
    // unknown_2538_0139_54B9();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC551, "unknown") { unknown_01ED_C551_E421() }
  fun unknown_01ED_C551_E421(): Runnable {
    // unknown_01ED_C53E_E40E();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC560, "unknown") { unknown_01ED_C560_E430() }
  fun unknown_01ED_C560_E430(): Runnable {
    // unknown_01ED_C53E_E40E();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC58A, "unknown") { unknown_01ED_C58A_E45A() }
  fun unknown_01ED_C58A_E45A(): Runnable {
    // unknown_01ED_C13B_E00B();
    // unknown_01ED_C6AD_E57D();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC5CF, "unknown") { unknown_01ED_C5CF_E49F() }
  fun unknown_01ED_C5CF_E49F(): Runnable {
    // unknown_01ED_C13B_E00B();
    // datastructures.getEsSiPointerToUnknown_01ED_C1F4_E0C4();
    // unknown_01ED_C202_E0D2();
    // unknown_01ED_C60B_E4DB();
    // unknown_01ED_E3DF_02AF();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC60B, "unknown") { unknown_01ED_C60B_E4DB() }
  fun unknown_01ED_C60B_E4DB(): Runnable {
    // unknown_01ED_C13B_E00B();
    // datastructures.getEsSiPointerToUnknown_01ED_C1F4_E0C4();
    // unknown_01ED_C202_E0D2();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC661, "unknown") { unknown_01ED_C661_E531() }
  fun unknown_01ED_C661_E531(): Runnable {
    // unknown_01ED_C13B_E00B();
    // unknown_01ED_C6AD_E57D();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC6AD, "unknown") { unknown_01ED_C6AD_E57D() }
  fun unknown_01ED_C6AD_E57D(): Runnable {
    // unknown_01ED_1797_3667();
    // unknown_01ED_C13B_E00B();
    // unknown_01ED_C30D_E1DD();
    // unknown_01ED_C443_E313();
    // unknown_01ED_C51E_E3EE();
    // unknown_01ED_C7D4_E6A4();
    // unknown_01ED_C835_E705();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC7D4, "unknown") { unknown_01ED_C7D4_E6A4() }
  fun unknown_01ED_C7D4_E6A4(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC835, "unknown") { unknown_01ED_C835_E705() }
  fun unknown_01ED_C835_E705(): Runnable {

    return nearRet()
  }

  // Not providing stub for dialogues.initDialogue. Reason: Function already has an override

  // Not providing stub for video.read33A3WithAxOffset/get_hnm_resource_flag_name_ptr_by_index_ax_to_bx_ida. Reason: Function already has an override

  // defineFunction(0x1ED, 0xC92B, "hnm_reset_and_read_header_ida") { hnm_reset_and_read_header_ida_01ED_C92B_E7FB() }
  fun hnm_reset_and_read_header_ida_01ED_C92B_E7FB(): Runnable {
    // ida.hnm_apply_palette_ida_01ED_C1BA_E08A();
    // video.read33A3WithAxOffset/get_hnm_resource_flag_name_ptr_by_index_ax_to_bx_ida_01ED_C921_E7F1();
    // ida.hnm_close_resource_ida_01ED_CA01_E8D1();
    // ida.hnm_read_header_size_ida_01ED_CD8F_EC5F();
    // hnm.hnmReadFromFileHandle_01ED_CDBF_EC8F();
    // unknown_01ED_CE01_ECD1();
    // ida.hnm_reset_ida_01ED_CE1A_ECEA();
    // ida.open_res_or_file_or_die_ida_01ED_F229_10F9();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xC9E8, "hnm_do_frame_skippable_ida") { hnm_do_frame_skippable_ida_01ED_C9E8_E8B8() }
  fun hnm_do_frame_skippable_ida_01ED_C9E8_E8B8(): Runnable {
    // ida.hnm_do_frame_ida_01ED_CA60_E930();
    // ida.stc_on_user_input_ida_01ED_DD63_FC33();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xCA01, "hnm_close_resource_ida") { hnm_close_resource_ida_01ED_CA01_E8D1() }
  fun hnm_close_resource_ida_01ED_CA01_E8D1(): Runnable {
    // unknown_01ED_CE01_ECD1();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xCA1B, "hnm_load_ida") { hnm_load_ida_01ED_CA1B_E8EB() }
  fun hnm_load_ida_01ED_CA1B_E8EB(): Runnable {
    // ida.decode_sd_block_ida_01ED_AA0F_C8DF();
    // ida.hnm_reset_and_read_header_ida_01ED_C92B_E7FB();
    // unknown_01ED_CB1A_E9EA();
    // ida.hnm_decode_video_frame_ida_01ED_CC96_EB66();
    // unknown_01ED_CCF4_EBC4();
    // ida.hnm_prepare_header_read_ida_01ED_CDA0_EC70();
    // ida.hnm_reset_ida_01ED_CE1A_ECEA();

    return nearRet()
  }

  // Not providing stub for video.videoPlayRelated. Reason: Function already has an override

  // defineFunction(0x1ED, 0xCA60, "hnm_do_frame_ida") { hnm_do_frame_ida_01ED_CA60_E930() }
  fun hnm_do_frame_ida_01ED_CA60_E930(): Runnable {
    // unknown_01ED_CA8F_E95F();
    // unknown_01ED_CAA0_E970();
    // unknown_01ED_CAD4_E9A4();
    // unknown_01ED_CB1A_E9EA();
    // unknown_01ED_CC4E_EB1E();
    // ida.hnm_decode_video_frame_ida_01ED_CC96_EB66();

    return nearRet()
  }

  // Not providing stub for unknown. Reason: Function has different return types: [NEAR, INTERRUPT, FAR]

  // defineFunction(0x1ED, 0xCAA0, "unknown") { unknown_01ED_CAA0_E970() }
  fun unknown_01ED_CAA0_E970(): Runnable {
    // unknown_01ED_CCF4_EBC4();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xCAD4, "unknown") { unknown_01ED_CAD4_E9A4() }
  fun unknown_01ED_CAD4_E9A4(): Runnable {
    // video.videoPlayRelated_01ED_CA59_E929();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xCB1A, "unknown") { unknown_01ED_CB1A_E9EA() }
  fun unknown_01ED_CB1A_E9EA(): Runnable {
    // unknown_01ED_CC0C_EADC();
    // unknown_01ED_CC2B_EAFB();
    // ida.hnm_read_header_size_ida_01ED_CD8F_EC5F();
    // providedInterrupts.provided_interrupt_handler_0x21_F000_0028_0028();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xCC0C, "unknown") { unknown_01ED_CC0C_EADC() }
  fun unknown_01ED_CC0C_EADC(): Runnable {

    return nearRet()
  }

  // Not providing stub for unknown. Reason: Function has different return types: [NEAR, INTERRUPT, FAR]

  // defineFunction(0x1ED, 0xCC4E, "unknown") { unknown_01ED_CC4E_EB1E() }
  fun unknown_01ED_CC4E_EB1E(): Runnable {

    return nearRet()
  }

  // Not providing stub for video.isLastFrame/check_if_hnm_complete_ida. Reason: Function already has an override

  // defineFunction(0x1ED, 0xCC96, "hnm_decode_video_frame_ida") { hnm_decode_video_frame_ida_01ED_CC96_EB66() }
  fun hnm_decode_video_frame_ida_01ED_CC96_EB66(): Runnable {
    // unknown_01ED_4B2B_69FB();
    // vgaDriver.drawMouseCursor_2538_0109_5489();
    // vgaDriver.blit_2538_010F_548F();
    // vgaDriver.copyframebufferExplodeAndCenter_2538_0133_54B3();
    // unknown_2538_0136_54B6();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xCCF4, "unknown") { unknown_01ED_CCF4_EBC4() }
  fun unknown_01ED_CCF4_EBC4(): Runnable {
    // mainCode.isUnknownDBC8And1/check_pcm_enabled_ida_01ED_AE2F_CCFF();
    // ida.hsq_decomp_skip_header_dssi_to_esdi_ida_01ED_F403_12D3();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xCD8F, "hnm_read_header_size_ida") { hnm_read_header_size_ida_01ED_CD8F_EC5F() }
  fun hnm_read_header_size_ida_01ED_CD8F_EC5F(): Runnable {
    // hnm.hnmReadFromFileHandle_01ED_CDBF_EC8F();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xCDA0, "hnm_prepare_header_read_ida") { hnm_prepare_header_read_ida_01ED_CDA0_EC70() }
  fun hnm_prepare_header_read_ida_01ED_CDA0_EC70(): Runnable {
    // ida.hnm_read_header_size_ida_01ED_CD8F_EC5F();
    // ida.hnm_reset_ida_01ED_CE1A_ECEA();
    // providedInterrupts.provided_interrupt_handler_0x21_F000_0028_0028();

    return nearRet()
  }

  // Not providing stub for hnm.hnmReadFromFileHandle. Reason: Function already has an override

  // defineFunction(0x1ED, 0xCE01, "unknown") { unknown_01ED_CE01_ECD1() }
  fun unknown_01ED_CE01_ECD1(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xCE1A, "hnm_reset_ida") { hnm_reset_ida_01ED_CE1A_ECEA() }
  fun hnm_reset_ida_01ED_CE1A_ECEA(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xCE53, "unknown") { unknown_01ED_CE53_ED23() }
  fun unknown_01ED_CE53_ED23(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xCE6C, "initialize_memory_handler_ida") { initialize_memory_handler_ida_01ED_CE6C_ED3C() }
  fun initialize_memory_handler_ida_01ED_CE6C_ED3C(): Runnable {
    // video.read33A3WithAxOffset/get_hnm_resource_flag_name_ptr_by_index_ax_to_bx_ida_01ED_C921_E7F1();
    // unknown_01ED_CE01_ECD1();
    // unknown_01ED_CEB0_ED80();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xCEB0, "unknown") { unknown_01ED_CEB0_ED80() }
  fun unknown_01ED_CEB0_ED80(): Runnable {
    // mainCode.memCopy8BytesDsSIToDsDi_01ED_5B99_7A69();
    // video.read33A3WithAxOffset/get_hnm_resource_flag_name_ptr_by_index_ax_to_bx_ida_01ED_C921_E7F1();
    // ida.hnm_reset_and_read_header_ida_01ED_C92B_E7FB();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xCEC9, "unknown") { unknown_01ED_CEC9_ED99() }
  fun unknown_01ED_CEC9_ED99(): Runnable {
    // unknown_01ED_CAA0_E970();
    // unknown_01ED_CAD4_E9A4();
    // ida.hnm_decode_video_frame_ida_01ED_CC96_EB66();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xCF70, "unknown") { unknown_01ED_CF70_EE40() }
  fun unknown_01ED_CF70_EE40(): Runnable {
    // ida.load_PHRASExx_HSQ_ida_01ED_D00F_EEDF();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xCFA0, "check_amr_or_eng_language_ida") { check_amr_or_eng_language_ida_01ED_CFA0_EE70() }
  fun check_amr_or_eng_language_ida_01ED_CFA0_EE70(): Runnable {
    // mainCode.isUnknownDBC8And1/check_pcm_enabled_ida_01ED_AE2F_CCFF();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xCFB9, "unknown") { unknown_01ED_CFB9_EE89() }
  fun unknown_01ED_CFB9_EE89(): Runnable {
    // datastructures.convertIndexTableToPointerTable/adjust_sub_resource_pointers_ida_01ED_0098_1F68();
    // ida.open_resource_by_index_si_ida_01ED_F0B9_0F89();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD00F, "load_PHRASExx_HSQ_ida") { load_PHRASExx_HSQ_ida_01ED_D00F_EEDF() }
  fun load_PHRASExx_HSQ_ida_01ED_D00F_EEDF(): Runnable {
    // datastructures.convertIndexTableToPointerTable/adjust_sub_resource_pointers_ida_01ED_0098_1F68();
    // ida.open_resource_by_index_si_ida_01ED_F0B9_0F89();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD03C, "unknown") { unknown_01ED_D03C_EF0C() }
  fun unknown_01ED_D03C_EF0C(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD04E, "unknown") { unknown_01ED_D04E_EF1E() }
  fun unknown_01ED_D04E_EF1E(): Runnable {

    return nearRet()
  }

  // Not providing stub for display.getCharacterCoordsXY. Reason: Function already has an override

  // Not providing stub for display.setFontToIntro. Reason: Function already has an override

  // Not providing stub for display.setFontToMenu. Reason: Function already has an override

  // Not providing stub for display.setFontToBook. Reason: Function already has an override

  // defineFunction(0x1ED, 0xD096, "unknown") { unknown_01ED_D096_EF66() }
  fun unknown_01ED_D096_EF66(): Runnable {
    // display.getCharacterCoordsXY_01ED_D05F_EF2F();
    // unknown_2538_0115_5495();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD0E3, "unknown") { unknown_01ED_D0E3_EFB3() }
  fun unknown_01ED_D0E3_EFB3(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD0FF, "unknown") { unknown_01ED_D0FF_EFCF() }
  fun unknown_01ED_D0FF_EFCF(): Runnable {
    // ida.open_sprite_sheet_ida_01ED_C13E_E00E();
    // ida.draw_sprite_ida_01ED_C22F_E0FF();
    // display.getCharacterCoordsXY_01ED_D05F_EF2F();
    // display.setFontToIntro_01ED_D068_EF38();
    // unknown_01ED_D0E3_EFB3();
    // display.pushAll_01ED_E270_0140();
    // display.popAll_01ED_E283_0153();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD12F, "unknown") { unknown_01ED_D12F_EFFF() }
  fun unknown_01ED_D12F_EFFF(): Runnable {
    // display.getCharacterCoordsXY_01ED_D05F_EF2F();
    // unknown_2538_0115_5495();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD194, "unknown") { unknown_01ED_D194_F064() }
  fun unknown_01ED_D194_F064(): Runnable {
    // unknown_01ED_CF70_EE40();
    // unknown_01ED_D04E_EF1E();
    // unknown_01ED_D1BB_F08B();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD1A6, "unknown") { unknown_01ED_D1A6_F076() }
  fun unknown_01ED_D1A6_F076(): Runnable {
    // unknown_01ED_D194_F064();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD1BB, "unknown") { unknown_01ED_D1BB_F08B() }
  fun unknown_01ED_D1BB_F08B(): Runnable {
    // unknown_01ED_D096_EF66();
    // unknown_01ED_D12F_EFFF();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD1EF, "unknown") { unknown_01ED_D1EF_F0BF() }
  fun unknown_01ED_D1EF_F0BF(): Runnable {
    // ida.load_icons_sprites_ida_01ED_C137_E007();
    // unknown_01ED_D200_F0D0();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD1F2, "unknown") { unknown_01ED_D1F2_F0C2() }
  fun unknown_01ED_D1F2_F0C2(): Runnable {
    // ida.load_icons_sprites_ida_01ED_C137_E007();
    // unknown_01ED_D200_F0D0();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD200, "unknown") { unknown_01ED_D200_F0D0() }
  fun unknown_01ED_D200_F0D0(): Runnable {
    // display.setTextVideoBufferSegmentDBD8/set_screen_as_active_framebuffer_ida_01ED_C08E_DF5E();
    // ida.draw_sprite_ida_01ED_C22F_E0FF();
    // unknown_2538_011B_549B();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD239, "unknown") { unknown_01ED_D239_F109() }
  fun unknown_01ED_D239_F109(): Runnable {
    // unknown_01ED_1A34_3904();
    // unknown_01ED_D1F2_F0C2();
    // unknown_01ED_E387_0257();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD23D, "unknown") { unknown_01ED_D23D_F10D() }
  fun unknown_01ED_D23D_F10D(): Runnable {
    // unknown_01ED_1A34_3904();
    // unknown_01ED_D1F2_F0C2();
    // unknown_01ED_E387_0257();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD280, "unknown") { unknown_01ED_D280_F150() }
  fun unknown_01ED_D280_F150(): Runnable {
    // unknown_01ED_A7C2_C692();
    // unknown_01ED_C0D5_DFA5();
    // unknown_01ED_D239_F109();
    // unknown_01ED_D23D_F10D();
    // display.pushAll_01ED_E270_0140();
    // display.popAll_01ED_E283_0153();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD2BD, "unknown") { unknown_01ED_D2BD_F18D() }
  fun unknown_01ED_D2BD_F18D(): Runnable {
    // unknown_01ED_D2EA_F1BA();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD2EA, "unknown") { unknown_01ED_D2EA_F1BA() }
  fun unknown_01ED_D2EA_F1BA(): Runnable {
    // mainCode.noOp_01ED_0F66_2E36();
    // unknown_01ED_4415_62E5();
    // unknown_01ED_97CF_B69F();
    // unknown_01ED_D36D_F23D();

    return nearRet()
  }

  // Not providing stub for mainCode.menuAnimationRelated. Reason: Function already has an override

  // defineFunction(0x1ED, 0xD323, "unknown") { unknown_01ED_D323_F1F3() }
  fun unknown_01ED_D323_F1F3(): Runnable {
    // unknown_01ED_D280_F150();
    // mainCode.menuAnimationRelated_01ED_D316_F1E6();
    // unknown_01ED_D338_F208();
    // mainCode.setBpToCurrentMenuTypeForScreenAction_01ED_D41B_F2EB();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD338, "unknown") { unknown_01ED_D338_F208() }
  fun unknown_01ED_D338_F208(): Runnable {
    // unknown_01ED_8751_A621();
    // mainCode.setBpToCurrentMenuTypeForScreenAction_01ED_D41B_F2EB();
    // mainCode.dispatcherHelperDeterminesWhereToJump_01ED_D454_F324();
    // unknown_01ED_D48A_F35A();
    // ida.call_restore_cursor_ida_01ED_DBB2_FA82();
    // ida.draw_mouse_ida_01ED_DBEC_FABC();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD33A, "unknown") { unknown_01ED_D33A_F20A() }
  fun unknown_01ED_D33A_F20A(): Runnable {
    // mainCode.setBpToCurrentMenuTypeForScreenAction_01ED_D41B_F2EB();
    // mainCode.dispatcherHelperDeterminesWhereToJump_01ED_D454_F324();
    // unknown_01ED_D48A_F35A();
    // ida.call_restore_cursor_ida_01ED_DBB2_FA82();
    // ida.draw_mouse_ida_01ED_DBEC_FABC();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD36D, "unknown") { unknown_01ED_D36D_F23D() }
  fun unknown_01ED_D36D_F23D(): Runnable {
    // unknown_01ED_9285_B155();
    // mainCode.setBpToCurrentMenuTypeForScreenAction_01ED_D41B_F2EB();
    // mainCode.dispatcherHelperDeterminesWhereToJump_01ED_D454_F324();
    // unknown_01ED_D48A_F35A();
    // unknown_01ED_D6FE_F5CE();
    // ida.call_restore_cursor_ida_01ED_DBB2_FA82();
    // ida.draw_mouse_ida_01ED_DBEC_FABC();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD397, "unknown") { unknown_01ED_D397_F267() }
  fun unknown_01ED_D397_F267(): Runnable {
    // mainCode.setBpToCurrentMenuTypeForScreenAction_01ED_D41B_F2EB();
    // unknown_01ED_D48A_F35A();

    return nearRet()
  }

  // Not providing stub for mainCode.setBpToCurrentMenuTypeForScreenAction. Reason: Function already has an override

  // defineFunction(0x1ED, 0xD42F, "unknown") { unknown_01ED_D42F_F2FF() }
  fun unknown_01ED_D42F_F2FF(): Runnable {
    // unknown_01ED_0A3E_290E();
    // unknown_01ED_5ADF_79AF();
    // unknown_01ED_8770_A640();
    // display.set479ETo0_01ED_9901_B7D1();
    // unknown_01ED_ADBE_CC8E();
    // unknown_01ED_AE04_CCD4();
    // unknown_01ED_B930_D800();
    // display.setVideoBufferSegmentDBD6/set_frontbuffer_as_active_framebuffer_ida_01ED_C07C_DF4C();
    // ida.gfx_call_bp_with_front_buffer_as_screen_ida_01ED_C097_DF67();
    // ida.transition_ida_01ED_C108_DFD8();
    // ida.open_sprite_sheet_ida_01ED_C13E_E00E();
    // ida.hnm_close_resource_ida_01ED_CA01_E8D1();
    // unknown_01ED_D2BD_F18D();
    // mainCode.dispatcherHelperDeterminesWhereToJump_01ED_D454_F324();
    // map.initMapCursorTypeDC58To0_01ED_DAA3_F973();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD434, "unknown") { unknown_01ED_D434_F304() }
  fun unknown_01ED_D434_F304(): Runnable {
    // display.set479ETo0_01ED_9901_B7D1();
    // unknown_01ED_B02C_CEFC();
    // unknown_01ED_B147_D017();
    // unknown_01ED_B150_D020();
    // unknown_01ED_B1AF_D07F();
    // unknown_01ED_D280_F150();
    // mainCode.menuAnimationRelated_01ED_D316_F1E6();
    // unknown_01ED_D338_F208();
    // mainCode.setBpToCurrentMenuTypeForScreenAction_01ED_D41B_F2EB();
    // mainCode.dispatcherHelperDeterminesWhereToJump_01ED_D454_F324();
    // unknown_01ED_D48A_F35A();
    // ida.call_restore_cursor_ida_01ED_DBB2_FA82();
    // ida.draw_mouse_ida_01ED_DBEC_FABC();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD439, "unknown") { unknown_01ED_D439_F309() }
  fun unknown_01ED_D439_F309(): Runnable {
    // unknown_01ED_1834_3704();
    // unknown_01ED_3AF9_59C9();
    // unknown_01ED_9197_B067();
    // unknown_01ED_91A0_B070();
    // unknown_01ED_93DF_B2AF();
    // unknown_01ED_9908_B7D8();
    // unknown_01ED_9B49_BA19();
    // unknown_01ED_9BAC_BA7C();
    // unknown_01ED_9F40_BE10();
    // unknown_01ED_9F9E_BE6E();
    // unknown_01ED_A7C2_C692();
    // mainCode.inc2788_01ED_B2B9_D189();
    // unknown_01ED_B30F_D1DF();
    // unknown_01ED_C0D5_DFA5();
    // unknown_01ED_C0F4_DFC4();
    // unknown_01ED_C4DD_E3AD();
    // unknown_01ED_D239_F109();
    // unknown_01ED_D23D_F10D();
    // unknown_01ED_D280_F150();
    // mainCode.menuAnimationRelated_01ED_D316_F1E6();
    // unknown_01ED_D338_F208();
    // mainCode.setBpToCurrentMenuTypeForScreenAction_01ED_D41B_F2EB();
    // mainCode.dispatcherHelperDeterminesWhereToJump_01ED_D454_F324();
    // display.pushAll_01ED_E270_0140();
    // display.popAll_01ED_E283_0153();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD43E, "unknown") { unknown_01ED_D43E_F30E() }
  fun unknown_01ED_D43E_F30E(): Runnable {
    // unknown_01ED_0A3E_290E();
    // unknown_01ED_2EFB_4DCB();
    // unknown_01ED_3093_4F63();
    // mainCode.fill47F8WithFF_01ED_3AE9_59B9();
    // unknown_01ED_407E_5F4E();
    // unknown_01ED_58FA_77CA();
    // unknown_01ED_5A1A_78EA();
    // unknown_01ED_5F79_7E49();
    // unknown_01ED_66CE_859E();
    // unknown_01ED_68EB_87BB();
    // unknown_01ED_6906_87D6();
    // unknown_01ED_697C_884C();
    // unknown_01ED_69A3_8873();
    // unknown_01ED_780A_96DA();
    // unknown_01ED_79DE_98AE();
    // unknown_01ED_7B58_9A28();
    // unknown_01ED_7C02_9AD2();
    // unknown_01ED_8C8A_AB5A();
    // unknown_01ED_90BD_AF8D();
    // unknown_01ED_956D_B43D();
    // display.set479ETo0_01ED_9901_B7D1();
    // unknown_01ED_9F31_BE01();
    // unknown_01ED_9F8B_BE5B();
    // unknown_01ED_A1C4_C094();
    // unknown_01ED_A1E2_C0B2();
    // unknown_01ED_A42C_C2FC();
    // unknown_01ED_A44C_C31C();
    // unknown_01ED_A47D_C34D();
    // unknown_01ED_A4C6_C396();
    // unknown_01ED_A7C2_C692();
    // unknown_01ED_AC3A_CB0A();
    // unknown_01ED_B024_CEF4();
    // unknown_01ED_B02C_CEFC();
    // unknown_01ED_B147_D017();
    // unknown_01ED_B150_D020();
    // unknown_01ED_B1AF_D07F();
    // mainCode.setUnknown2788To0_01ED_B2BE_D18E();
    // unknown_01ED_B473_D343();
    // unknown_01ED_B4BB_D38B();
    // unknown_01ED_B683_D553();
    // unknown_01ED_B8EA_D7BA();
    // unknown_01ED_B96B_D83B();
    // unknown_01ED_B98B_D85B();
    // unknown_01ED_B9E0_D8B0();
    // unknown_01ED_BA15_D8E5();
    // display.setTextVideoBufferSegmentDBD8/set_screen_as_active_framebuffer_ida_01ED_C08E_DF5E();
    // unknown_01ED_C0D5_DFA5();
    // ida.open_sprite_sheet_ida_01ED_C13E_E00E();
    // ida.draw_sprite_ida_01ED_C22F_E0FF();
    // unknown_01ED_D239_F109();
    // unknown_01ED_D23D_F10D();
    // unknown_01ED_D280_F150();
    // unknown_01ED_D2BD_F18D();
    // mainCode.menuAnimationRelated_01ED_D316_F1E6();
    // unknown_01ED_D338_F208();
    // unknown_01ED_D33A_F20A();
    // mainCode.setBpToCurrentMenuTypeForScreenAction_01ED_D41B_F2EB();
    // mainCode.dispatcherHelperDeterminesWhereToJump_01ED_D454_F324();
    // unknown_01ED_D48A_F35A();
    // map.setMapClickHandlerAddressFromAx_01ED_D95E_F82E();
    // initRelated.vgaInitRelated_01ED_DA53_F923();
    // ida.call_restore_cursor_ida_01ED_DBB2_FA82();
    // ida.draw_mouse_ida_01ED_DBEC_FABC();
    // display.pushAll_01ED_E270_0140();
    // display.popAll_01ED_E283_0153();
    // ida.alloc_cx_pages_to_di_ida_01ED_F11C_0FEC();
    // ida.open_nonres_file_ida_01ED_F255_1125();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD443, "dispatcherJumpsToBX") { dispatcherJumpsToBX_01ED_D443_F313() }
  fun dispatcherJumpsToBX_01ED_D443_F313(): Runnable {
    // unknown_01ED_1797_3667();
    // unknown_01ED_17BE_368E();
    // unknown_01ED_1834_3704();
    // unknown_01ED_18BA_378A();
    // unknown_01ED_2170_4040();
    // ida.open_SAL_resource_ida_01ED_2D74_4C44();
    // unknown_01ED_35AD_547D();
    // unknown_01ED_37B2_5682();
    // unknown_01ED_407E_5F4E();
    // unknown_01ED_409A_5F6A();
    // unknown_01ED_40AE_5F7E();
    // unknown_01ED_40C3_5F93();
    // unknown_01ED_4182_6052();
    // unknown_01ED_425B_612B();
    // mainCode.setUnknown11CATo0_01ED_4AC4_6994();
    // unknown_01ED_4B3B_6A0B();
    // unknown_01ED_503C_6F0C();
    // unknown_01ED_5ADF_79AF();
    // unknown_01ED_5B5D_7A2D();
    // mainCode.memCopy8BytesFrom1470ToD83C_01ED_5BA0_7A70();
    // unknown_01ED_5BB0_7A80();
    // unknown_01ED_68EB_87BB();
    // unknown_01ED_693B_880B();
    // unknown_01ED_6ACB_899B();
    // unknown_01ED_7BB9_9A89();
    // unknown_01ED_9B49_BA19();
    // unknown_01ED_9F40_BE10();
    // unknown_01ED_9F9E_BE6E();
    // unknown_01ED_A1C4_C094();
    // unknown_01ED_A1E2_C0B2();
    // unknown_01ED_A7C2_C692();
    // unknown_01ED_AD43_CC13();
    // unknown_01ED_AD5E_CC2E();
    // unknown_01ED_ADBE_CC8E();
    // unknown_01ED_AE04_CCD4();
    // mainCode.isUnknownDBC80x100And2943BitmaskNonZero_01ED_AEC6_CD96();
    // unknown_01ED_B532_D402();
    // ida.map_func_ida_01ED_B58B_D45B();
    // unknown_01ED_B930_D800();
    // unknown_01ED_BA9E_D96E();
    // unknown_01ED_BC99_DB69();
    // display.setVideoBufferSegmentDBD6/set_frontbuffer_as_active_framebuffer_ida_01ED_C07C_DF4C();
    // ida.gfx_call_bp_with_front_buffer_as_screen_ida_01ED_C097_DF67();
    // unknown_01ED_C0D5_DFA5();
    // unknown_01ED_C0F4_DFC4();
    // ida.transition_ida_01ED_C108_DFD8();
    // unknown_01ED_C13B_E00B();
    // unknown_01ED_C412_E2E2();
    // ida.gfx_copy_framebuf_to_screen_ida_01ED_C4CD_E39D();
    // ida.hnm_close_resource_ida_01ED_CA01_E8D1();
    // unknown_01ED_D239_F109();
    // unknown_01ED_D23D_F10D();
    // unknown_01ED_D2BD_F18D();
    // unknown_01ED_D2EA_F1BA();
    // mainCode.menuAnimationRelated_01ED_D316_F1E6();
    // mainCode.dispatcherHelperDeterminesWhereToJump_01ED_D454_F324();
    // unknown_01ED_D717_F5E7();
    // map.initMapCursorTypeDC58To0_01ED_DAA3_F973();
    // ida.call_restore_cursor_ida_01ED_DBB2_FA82();
    // display.pushAll_01ED_E270_0140();
    // display.popAll_01ED_E283_0153();
    // unknown_01ED_E387_0257();
    // unknown_01ED_E3CC_029C();
    // ida.uninitialize_memory_driver_ida_01ED_E8D5_07A5();
    // unknown_2538_0160_54E0();
    // soundDriverPcSpeaker.clearAL_4822_0103_8323();
    // soundDriverPcSpeaker.clearAL_482B_0106_83B6();
    // providedInterrupts.provided_interrupt_handler_0x10_F000_000A_000A();
    // providedInterrupts.provided_interrupt_handler_0x21_F000_0028_0028();
    // providedInterrupts.provided_interrupt_handler_0x33_F000_002D_002D();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD454, "dispatcherHelperDeterminesWhereToJump") { dispatcherHelperDeterminesWhereToJump_01ED_D454_F324() }
  fun dispatcherHelperDeterminesWhereToJump_01ED_D454_F324(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD48A, "unknown") { unknown_01ED_D48A_F35A() }
  fun unknown_01ED_D48A_F35A(): Runnable {
    // display.setVideoBufferSegmentDBD6/set_frontbuffer_as_active_framebuffer_ida_01ED_C07C_DF4C();
    // display.setTextVideoBufferSegmentDBD8/set_screen_as_active_framebuffer_ida_01ED_C08E_DF5E();
    // unknown_01ED_CF70_EE40();
    // unknown_01ED_D04E_EF1E();
    // display.getCharacterCoordsXY_01ED_D05F_EF2F();
    // display.setFontToMenu_01ED_D075_EF45();
    // unknown_01ED_D12F_EFFF();
    // unknown_01ED_D1BB_F08B();
    // unknown_2538_011E_549E();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD50F, "unknown") { unknown_01ED_D50F_F3DF() }
  fun unknown_01ED_D50F_F3DF(): Runnable {
    // unknown_01ED_9285_B155();
    // unknown_01ED_92C9_B199();
    // mainCode.setBpToCurrentMenuTypeForScreenAction_01ED_D41B_F2EB();
    // mainCode.dispatcherHelperDeterminesWhereToJump_01ED_D454_F324();
    // unknown_01ED_D48A_F35A();
    // unknown_01ED_D6FE_F5CE();
    // ida.call_restore_cursor_ida_01ED_DBB2_FA82();
    // ida.draw_mouse_ida_01ED_DBEC_FABC();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD61D, "unknown") { unknown_01ED_D61D_F4ED() }
  fun unknown_01ED_D61D_F4ED(): Runnable {
    // mainCode.setBpToCurrentMenuTypeForScreenAction_01ED_D41B_F2EB();
    // display.pushAll_01ED_E270_0140();
    // display.popAll_01ED_E283_0153();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD65A, "unknown") { unknown_01ED_D65A_F52A() }
  fun unknown_01ED_D65A_F52A(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD694, "unknown") { unknown_01ED_D694_F564() }
  fun unknown_01ED_D694_F564(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD6B7, "unknown") { unknown_01ED_D6B7_F587() }
  fun unknown_01ED_D6B7_F587(): Runnable {
    // unknown_01ED_D694_F564();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD6FE, "unknown") { unknown_01ED_D6FE_F5CE() }
  fun unknown_01ED_D6FE_F5CE(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD717, "unknown") { unknown_01ED_D717_F5E7() }
  fun unknown_01ED_D717_F5E7(): Runnable {
    // ida.load_icons_sprites_ida_01ED_C137_E007();
    // unknown_01ED_D200_F0D0();
    // unknown_01ED_D741_F611();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD72B, "unknown") { unknown_01ED_D72B_F5FB() }
  fun unknown_01ED_D72B_F5FB(): Runnable {
    // ida.load_icons_sprites_ida_01ED_C137_E007();
    // unknown_01ED_D200_F0D0();
    // unknown_01ED_D741_F611();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD741, "unknown") { unknown_01ED_D741_F611() }
  fun unknown_01ED_D741_F611(): Runnable {
    // unknown_2538_011E_549E();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD75A, "unknown") { unknown_01ED_D75A_F62A() }
  fun unknown_01ED_D75A_F62A(): Runnable {
    // unknown_01ED_1A34_3904();
    // ida.load_icons_sprites_ida_01ED_C137_E007();
    // unknown_01ED_D1F2_F0C2();
    // unknown_01ED_D200_F0D0();
    // unknown_01ED_D795_F665();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD763, "unknown") { unknown_01ED_D763_F633() }
  fun unknown_01ED_D763_F633(): Runnable {
    // ida.load_icons_sprites_ida_01ED_C137_E007();
    // unknown_01ED_D1F2_F0C2();
    // unknown_01ED_D200_F0D0();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD792, "unknown") { unknown_01ED_D792_F662() }
  fun unknown_01ED_D792_F662(): Runnable {
    // ida.load_icons_sprites_ida_01ED_C137_E007();
    // unknown_01ED_D200_F0D0();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD795, "unknown") { unknown_01ED_D795_F665() }
  fun unknown_01ED_D795_F665(): Runnable {
    // ida.load_icons_sprites_ida_01ED_C137_E007();
    // unknown_01ED_D200_F0D0();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD7AD, "unknown") { unknown_01ED_D7AD_F67D() }
  fun unknown_01ED_D7AD_F67D(): Runnable {
    // ida.load_icons_sprites_ida_01ED_C137_E007();
    // unknown_01ED_D200_F0D0();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD7B2, "unknown") { unknown_01ED_D7B2_F682() }
  fun unknown_01ED_D7B2_F682(): Runnable {
    // ida.load_icons_sprites_ida_01ED_C137_E007();
    // unknown_01ED_D200_F0D0();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xD7B7, "unknown") { unknown_01ED_D7B7_F687() }
  fun unknown_01ED_D7B7_F687(): Runnable {
    // ida.load_icons_sprites_ida_01ED_C137_E007();
    // ida.open_sprite_sheet_ida_01ED_C13E_E00E();
    // unknown_01ED_D763_F633();
    // ida.call_restore_cursor_ida_01ED_DBB2_FA82();
    // ida.draw_mouse_ida_01ED_DBEC_FABC();

    return nearRet()
  }

  // Not providing stub for unknown. Reason: Function has no return

  // Not providing stub for mainCode.noOp. Reason: Function already has an override

  // Not providing stub for map.setMapClickHandlerAddressToInGame. Reason: Function already has an override

  // Not providing stub for map.setMapClickHandlerAddressFromAx. Reason: Function already has an override

  // defineFunction(0x1ED, 0xD9D2, "unknown") { unknown_01ED_D9D2_F8A2() }
  fun unknown_01ED_D9D2_F8A2(): Runnable {
    // unknown_01ED_176B_363B();
    // unknown_01ED_44AB_637B();
    // unknown_01ED_46B5_6585();
    // unknown_01ED_6B34_8A04();
    // unknown_01ED_99BE_B88E();
    // unknown_01ED_ACE6_CBB6();
    // unknown_01ED_B9AE_D87E();
    // unknown_01ED_BE57_DD27();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xDA25, "unknown") { unknown_01ED_DA25_F8F5() }
  fun unknown_01ED_DA25_F8F5(): Runnable {

    return nearRet()
  }

  // Not providing stub for initRelated.vgaInitRelated. Reason: Function already has an override

  // defineFunction(0x1ED, 0xDA5F, "unknown") { unknown_01ED_DA5F_F92F() }
  fun unknown_01ED_DA5F_F92F(): Runnable {

    return nearRet()
  }

  // Not providing stub for map.initMapCursorTypeDC58To0. Reason: Function already has an override

  // Not providing stub for map.setSiToMapCursorTypeDC58. Reason: Function already has an override

  // defineFunction(0x1ED, 0xDAE3, "set_mouse_pos_ida") { set_mouse_pos_ida_01ED_DAE3_F9B3() }
  fun set_mouse_pos_ida_01ED_DAE3_F9B3(): Runnable {
    // providedInterrupts.provided_interrupt_handler_0x33_F000_002D_002D();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xDB03, "unknown") { unknown_01ED_DB03_F9D3() }
  fun unknown_01ED_DB03_F9D3(): Runnable {
    // ida.set_mouse_pos_ida_01ED_DAE3_F9B3();
    // ida.call_restore_cursor_ida_01ED_DBB2_FA82();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xDB14, "define_mouse_range_ida") { define_mouse_range_ida_01ED_DB14_F9E4() }
  fun define_mouse_range_ida_01ED_DB14_F9E4(): Runnable {
    // mainCode.shlDXAndCXByAX_01ED_DB44_FA14();
    // providedInterrupts.provided_interrupt_handler_0x33_F000_002D_002D();

    return nearRet()
  }

  // Not providing stub for mainCode.shlDXAndCXByAX. Reason: Function already has an override

  // defineFunction(0x1ED, 0xDB4C, "mouse_stuff_ida") { mouse_stuff_ida_01ED_DB4C_FA1C() }
  fun mouse_stuff_ida_01ED_DB4C_FA1C(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xDB67, "unknown") { unknown_01ED_DB67_FA37() }
  fun unknown_01ED_DB67_FA37(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xDB74, "unknown") { unknown_01ED_DB74_FA44() }
  fun unknown_01ED_DB74_FA44(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xDBB2, "call_restore_cursor_ida") { call_restore_cursor_ida_01ED_DBB2_FA82() }
  fun call_restore_cursor_ida_01ED_DBB2_FA82(): Runnable {
    // vgaDriver.restoreImageUnderMouseCursor_2538_010C_548C();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xDBEC, "draw_mouse_ida") { draw_mouse_ida_01ED_DBEC_FABC() }
  fun draw_mouse_ida_01ED_DBEC_FABC(): Runnable {
    // vgaDriver.drawMouseCursor_2538_0109_5489();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xDC20, "redraw_mouse_ida") { redraw_mouse_ida_01ED_DC20_FAF0() }
  fun redraw_mouse_ida_01ED_DC20_FAF0(): Runnable {
    // unknown_01ED_DC6A_FB3A();
    // vgaDriver.drawMouseCursor_2538_0109_5489();
    // vgaDriver.restoreImageUnderMouseCursor_2538_010C_548C();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xDC6A, "unknown") { unknown_01ED_DC6A_FB3A() }
  fun unknown_01ED_DC6A_FB3A(): Runnable {
    // unknown_01ED_D6FE_F5CE();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xDD63, "stc_on_user_input_ida") { stc_on_user_input_ida_01ED_DD63_FC33() }
  fun stc_on_user_input_ida_01ED_DD63_FC33(): Runnable {
    // unknown_01ED_D9D2_F8A2();
    // unknown_01ED_DE54_FD24();
    // unknown_01ED_DE7B_FD4B();
    // unknown_01ED_E3CC_029C();
    // providedInterrupts.provided_interrupt_handler_0x33_F000_002D_002D();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xDDB0, "unknown") { unknown_01ED_DDB0_FC80() }
  fun unknown_01ED_DDB0_FC80(): Runnable {
    // ida.stc_on_user_input_ida_01ED_DD63_FC33();
    // mainCode.setCEE8To0_01ED_DE4E_FD1E();
    // display.pushAll_01ED_E270_0140();
    // display.popAll_01ED_E283_0153();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xDE0C, "check_midi_ida") { check_midi_ida_01ED_DE0C_FCDC() }
  fun check_midi_ida_01ED_DE0C_FCDC(): Runnable {

    return nearRet()
  }

  // Not providing stub for mainCode.setCEE8To0. Reason: Function already has an override

  // defineFunction(0x1ED, 0xDE54, "unknown") { unknown_01ED_DE54_FD24() }
  fun unknown_01ED_DE54_FD24(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xDE7B, "unknown") { unknown_01ED_DE7B_FD4B() }
  fun unknown_01ED_DE7B_FD4B(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xDF1E, "get_mouse_pos_etc_ida") { get_mouse_pos_etc_ida_01ED_DF1E_FDEE() }
  fun get_mouse_pos_etc_ida_01ED_DF1E_FDEE(): Runnable {
    // unknown_01ED_DE7B_FD4B();
    // providedInterrupts.provided_interrupt_handler_0x33_F000_002D_002D();

    return nearRet()
  }

  // Not providing stub for mainCode.noOp. Reason: Function already has an override

  // Not providing stub for display.pushAll. Reason: Function already has an override

  // Not providing stub for display.popAll. Reason: Function already has an override

  // defineFunction(0x1ED, 0xE290, "unknown") { unknown_01ED_E290_0160() }
  fun unknown_01ED_E290_0160(): Runnable {
    // unknown_01ED_D04E_EF1E();
    // unknown_01ED_D12F_EFFF();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xE2DB, "unknown") { unknown_01ED_E2DB_01AB() }
  fun unknown_01ED_E2DB_01AB(): Runnable {
    // unknown_01ED_CF70_EE40();
    // unknown_01ED_D03C_EF0C();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xE2E3, "unknown") { unknown_01ED_E2E3_01B3() }
  fun unknown_01ED_E2E3_01B3(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xE31C, "unknown") { unknown_01ED_E31C_01EC() }
  fun unknown_01ED_E31C_01EC(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xE353, "unknown") { unknown_01ED_E353_0223() }
  fun unknown_01ED_E353_0223(): Runnable {
    // unknown_01ED_4821_66F1();
    // unknown_01ED_DE7B_FD4B();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xE387, "unknown") { unknown_01ED_E387_0257() }
  fun unknown_01ED_E387_0257(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xE3A0, "unknown") { unknown_01ED_E3A0_0270() }
  fun unknown_01ED_E3A0_0270(): Runnable {
    // unknown_01ED_D9D2_F8A2();
    // display.pushAll_01ED_E270_0140();
    // display.popAll_01ED_E283_0153();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xE3B7, "unknown") { unknown_01ED_E3B7_0287() }
  fun unknown_01ED_E3B7_0287(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xE3CC, "unknown") { unknown_01ED_E3CC_029C() }
  fun unknown_01ED_E3CC_029C(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xE3DF, "unknown") { unknown_01ED_E3DF_02AF() }
  fun unknown_01ED_E3DF_02AF(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xE4AD, "parse_command_line_ida") { parse_command_line_ida_01ED_E4AD_037D() }
  fun parse_command_line_ida_01ED_E4AD_037D(): Runnable {
    // ida.parse_cmd_is_end_of_arg_ida_01ED_E56B_043B();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xE56B, "parse_cmd_is_end_of_arg_ida") { parse_cmd_is_end_of_arg_ida_01ED_E56B_043B() }
  fun parse_cmd_is_end_of_arg_ida_01ED_E56B_043B(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xE57B, "load_driver_ax_with_vtable_at_si_ida") { load_driver_ax_with_vtable_at_si_ida_01ED_E57B_044B() }
  fun load_driver_ax_with_vtable_at_si_ida_01ED_E57B_044B(): Runnable {
    // ida.open_resource_by_index_si_ida_01ED_F0B9_0F89();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xE594, "initialize_ida") { initialize_ida_01ED_E594_0464() }
  fun initialize_ida_01ED_E594_0464(): Runnable {
    // display.setVideoBufferSegmentDBD6/set_frontbuffer_as_active_framebuffer_ida_01ED_C07C_DF4C();
    // display.setTextVideoBufferSegmentDBD8/set_screen_as_active_framebuffer_ida_01ED_C08E_DF5E();
    // display.clearCurrentVideoBuffer/gfx_clear_frame_buffer_ida_01ED_C0AD_DF7D();
    // ida.initialize_memory_handler_ida_01ED_CE6C_ED3C();
    // unknown_01ED_DB03_F9D3();
    // ida.define_mouse_range_ida_01ED_DB14_F9E4();
    // ida.load_driver_ax_with_vtable_at_si_ida_01ED_E57B_044B();
    // ida.open_dune_dat_ida_01ED_E675_0545();
    // ida.initialize_audio_ida_01ED_E76A_063A();
    // unknown_01ED_E85C_072C();
    // ida.initialize_mouse_ida_01ED_E97A_084A();
    // ida.memory_func_qq_ida_01ED_EA7B_094B();
    // ida.bump_alloc_get_addr_in_di_ida_01ED_F0F6_0FC6();
    // ida.bump_allocate_bump_cx_bytes_ida_01ED_F0FF_0FCF();
    // vgaDriver.setMode_2538_0100_5480();
    // vgaDriver.getInfoInAxCxBp_2538_0103_5483();
    // vgaDriver.memcpyDSToESFor64000_2538_0121_54A1();
    // unknown_2538_0154_54D4();
    // providedInterrupts.provided_interrupt_handler_0x21_F000_0028_0028();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xE675, "open_dune_dat_ida") { open_dune_dat_ida_01ED_E675_0545() }
  fun open_dune_dat_ida_01ED_E675_0545(): Runnable {
    // ida.read_dune_dat_toc_ida_01ED_E741_0611();
    // mainCode.unknownStructCreation_01ED_E75B_062B();
    // ida.open_res_or_file_to_dx_size_ax_ida_01ED_F1FB_10CB();
    // ida.locate_res_by_name_dssi_ida_01ED_F314_11E4();
    // unknown_01ED_F3A7_1277();
    // providedInterrupts.provided_interrupt_handler_0x21_F000_0028_0028();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xE741, "read_dune_dat_toc_ida") { read_dune_dat_toc_ida_01ED_E741_0611() }
  fun read_dune_dat_toc_ida_01ED_E741_0611(): Runnable {
    // ida.seek_dune_dat_offset_dxax_ida_01ED_F2D6_11A6();
    // ida.read_dune_dat_cx_to_esdi_ida_01ED_F2EA_11BA();

    return nearRet()
  }

  // Not providing stub for mainCode.unknownStructCreation. Reason: Function already has an override

  // defineFunction(0x1ED, 0xE76A, "initialize_audio_ida") { initialize_audio_ida_01ED_E76A_063A() }
  fun initialize_audio_ida_01ED_E76A_063A(): Runnable {
    // unknown_01ED_A637_C507();
    // unknown_01ED_A650_C520();
    // ida.audio_test_frequency_ida_01ED_A87E_C74E();
    // mainCode.isUnknownDBC80x100_01ED_AE28_CCF8();
    // unknown_01ED_AE3F_CD0F();
    // unknown_01ED_AE54_CD24();
    // ida.load_driver_ax_with_vtable_at_si_ida_01ED_E57B_044B();
    // unknown_01ED_E826_06F6();
    // mainCode.checkUnknown39B9_01ED_E851_0721();
    // soundDriverPcSpeaker.pcSpeakerActivationWithBXAndALCleanup_4822_0100_8320();
    // soundDriverPcSpeaker.pcSpeakerActivationWithBXAndALCleanup_482B_0100_83B0();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xE826, "unknown") { unknown_01ED_E826_06F6() }
  fun unknown_01ED_E826_06F6(): Runnable {
    // ida.read_dune_dat_toc_ida_01ED_E741_0611();
    // mainCode.unknownStructCreation_01ED_E75B_062B();
    // ida.locate_res_by_name_dssi_ida_01ED_F314_11E4();
    // unknown_01ED_F3A7_1277();

    return nearRet()
  }

  // Not providing stub for mainCode.checkUnknown39B9. Reason: Function already has an override

  // defineFunction(0x1ED, 0xE85C, "unknown") { unknown_01ED_E85C_072C() }
  fun unknown_01ED_E85C_072C(): Runnable {
    // ida.install_interrupt_handlers_ida_01ED_E913_07E3();

    return nearRet()
  }

  // Not providing stub for timer.setPitTimerToAX. Reason: Function already has an override

  // defineFunction(0x1ED, 0xE8B8, "get_pit_timer_value_ida") { get_pit_timer_value_ida_01ED_E8B8_0788() }
  fun get_pit_timer_value_ida_01ED_E8B8_0788(): Runnable {
    // unknown_01ED_EFBA_0E8A();

    return interruptRet()
  }

  // defineFunction(0x1ED, 0xE8D5, "uninitialize_memory_driver_ida") { uninitialize_memory_driver_ida_01ED_E8D5_07A5() }
  fun uninitialize_memory_driver_ida_01ED_E8D5_07A5(): Runnable {
    // timer.setPitTimerToAX_01ED_E8A8_0778();
    // providedInterrupts.provided_interrupt_handler_0x21_F000_0028_0028();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xE913, "install_interrupt_handlers_ida") { install_interrupt_handlers_ida_01ED_E913_07E3() }
  fun install_interrupt_handlers_ida_01ED_E913_07E3(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xE97A, "initialize_mouse_ida") { initialize_mouse_ida_01ED_E97A_084A() }
  fun initialize_mouse_ida_01ED_E97A_084A(): Runnable {
    // providedInterrupts.provided_interrupt_handler_0x21_F000_0028_0028();
    // providedInterrupts.provided_interrupt_handler_0x33_F000_002D_002D();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xEA7B, "memory_func_qq_ida") { memory_func_qq_ida_01ED_EA7B_094B() }
  fun memory_func_qq_ida_01ED_EA7B_094B(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xEF6A, "interrupt_handler_0x8") { interrupt_handler_0x8_01ED_EF6A_0E3A() }
  fun interrupt_handler_0x8_01ED_EF6A_0E3A(): Runnable {
    // unknown_01ED_CEC9_ED99();
    // unknown_01ED_EFBA_0E8A();

    return interruptRet()
  }

  // defineFunction(0x1ED, 0xEFBA, "unknown") { unknown_01ED_EFBA_0E8A() }
  fun unknown_01ED_EFBA_0E8A(): Runnable {
    // unknown_482B_010F_83BF();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xEFE7, "interrupt_handler_0x9") { interrupt_handler_0x9_01ED_EFE7_0EB7() }
  fun interrupt_handler_0x9_01ED_EFE7_0EB7(): Runnable {

    return interruptRet()
  }

  // defineFunction(0x1ED, 0xF0A0, "open_resource_force_hsq_ida") { open_resource_force_hsq_ida_01ED_F0A0_0F70() }
  fun open_resource_force_hsq_ida_01ED_F0A0_0F70(): Runnable {
    // ida.open_resource_by_index_si_ida_01ED_F0B9_0F89();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xF0B9, "open_resource_by_index_si_ida") { open_resource_by_index_si_ida_01ED_F0B9_0F89() }
  fun open_resource_by_index_si_ida_01ED_F0B9_0F89(): Runnable {
    // ida.read_and_maybe_hsq_ida_01ED_F0D6_0FA6();
    // ida.alloc_cx_pages_to_di_ida_01ED_F11C_0FEC();
    // ida.read_resource_to_esdi_ida_01ED_F244_1114();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xF0D6, "read_and_maybe_hsq_ida") { read_and_maybe_hsq_ida_01ED_F0D6_0FA6() }
  fun read_and_maybe_hsq_ida_01ED_F0D6_0FA6(): Runnable {
    // ida.read_resource_to_esdi_ida_01ED_F244_1114();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xF0F6, "bump_alloc_get_addr_in_di_ida") { bump_alloc_get_addr_in_di_ida_01ED_F0F6_0FC6() }
  fun bump_alloc_get_addr_in_di_ida_01ED_F0F6_0FC6(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xF0FF, "bump_allocate_bump_cx_bytes_ida") { bump_allocate_bump_cx_bytes_ida_01ED_F0FF_0FCF() }
  fun bump_allocate_bump_cx_bytes_ida_01ED_F0FF_0FCF(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xF11C, "alloc_cx_pages_to_di_ida") { alloc_cx_pages_to_di_ida_01ED_F11C_0FEC() }
  fun alloc_cx_pages_to_di_ida_01ED_F11C_0FEC(): Runnable {
    // ida.allocator_attempt_to_free_space_ida_01ED_F13F_100F();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xF13F, "allocator_attempt_to_free_space_ida") { allocator_attempt_to_free_space_ida_01ED_F13F_100F() }
  fun allocator_attempt_to_free_space_ida_01ED_F13F_100F(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xF1FB, "open_res_or_file_to_dx_size_ax_ida") { open_res_or_file_to_dx_size_ax_ida_01ED_F1FB_10CB() }
  fun open_res_or_file_to_dx_size_ax_ida_01ED_F1FB_10CB(): Runnable {
    // ida.seek_dune_dat_to_res_dsdx_ida_01ED_F2A7_1177();
    // ida.strcpy_to_filename_buf_ida_01ED_F2FC_11CC();
    // providedInterrupts.provided_interrupt_handler_0x21_F000_0028_0028();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xF204, "unknown") { unknown_01ED_F204_10D4() }
  fun unknown_01ED_F204_10D4(): Runnable {
    // ida.strcpy_to_filename_buf_ida_01ED_F2FC_11CC();
    // providedInterrupts.provided_interrupt_handler_0x21_F000_0028_0028();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xF229, "open_res_or_file_or_die_ida") { open_res_or_file_or_die_ida_01ED_F229_10F9() }
  fun open_res_or_file_or_die_ida_01ED_F229_10F9(): Runnable {
    // ida.open_res_or_file_to_dx_size_ax_ida_01ED_F1FB_10CB();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xF244, "read_resource_to_esdi_ida") { read_resource_to_esdi_ida_01ED_F244_1114() }
  fun read_resource_to_esdi_ida_01ED_F244_1114(): Runnable {
    // ida.open_res_or_file_or_die_ida_01ED_F229_10F9();
    // ida.read_dune_dat_cx_to_esdi_ida_01ED_F2EA_11BA();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xF255, "open_nonres_file_ida") { open_nonres_file_ida_01ED_F255_1125() }
  fun open_nonres_file_ida_01ED_F255_1125(): Runnable {
    // unknown_01ED_F204_10D4();
    // providedInterrupts.provided_interrupt_handler_0x21_F000_0028_0028();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xF2A7, "seek_dune_dat_to_res_dsdx_ida") { seek_dune_dat_to_res_dsdx_ida_01ED_F2A7_1177() }
  fun seek_dune_dat_to_res_dsdx_ida_01ED_F2A7_1177(): Runnable {
    // ida.seek_dune_dat_offset_dxax_ida_01ED_F2D6_11A6();
    // ida.locate_res_by_name_dssi_ida_01ED_F314_11E4();
    // unknown_01ED_F3A7_1277();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xF2D6, "seek_dune_dat_offset_dxax_ida") { seek_dune_dat_offset_dxax_ida_01ED_F2D6_11A6() }
  fun seek_dune_dat_offset_dxax_ida_01ED_F2D6_11A6(): Runnable {
    // providedInterrupts.provided_interrupt_handler_0x21_F000_0028_0028();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xF2EA, "read_dune_dat_cx_to_esdi_ida") { read_dune_dat_cx_to_esdi_ida_01ED_F2EA_11BA() }
  fun read_dune_dat_cx_to_esdi_ida_01ED_F2EA_11BA(): Runnable {
    // providedInterrupts.provided_interrupt_handler_0x21_F000_0028_0028();

    return nearRet()
  }

  // defineFunction(0x1ED, 0xF2FC, "strcpy_to_filename_buf_ida") { strcpy_to_filename_buf_ida_01ED_F2FC_11CC() }
  fun strcpy_to_filename_buf_ida_01ED_F2FC_11CC(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xF314, "locate_res_by_name_dssi_ida") { locate_res_by_name_dssi_ida_01ED_F314_11E4() }
  fun locate_res_by_name_dssi_ida_01ED_F314_11E4(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xF3A7, "unknown") { unknown_01ED_F3A7_1277() }
  fun unknown_01ED_F3A7_1277(): Runnable {

    return nearRet()
  }

  // defineFunction(0x1ED, 0xF403, "hsq_decomp_skip_header_dssi_to_esdi_ida") { hsq_decomp_skip_header_dssi_to_esdi_ida_01ED_F403_12D3() }
  fun hsq_decomp_skip_header_dssi_to_esdi_ida_01ED_F403_12D3(): Runnable {

    return nearRet()
  }

  // defineFunction(0x2538, 0x100, "setMode") { setMode_2538_0100_5480() }
  fun setMode_2538_0100_5480(): Runnable {
    // providedInterrupts.provided_interrupt_handler_0x10_F000_000A_000A();

    return farRet()
  }

  // Not providing stub for vgaDriver.getInfoInAxCxBp. Reason: Function already has an override

  // defineFunction(0x2538, 0x106, "unknown") { unknown_2538_0106_5486() }
  fun unknown_2538_0106_5486(): Runnable {
    // vgaDriver.setBxCxPaletteRelated_2538_0A21_5DA1();

    return farRet()
  }

  // defineFunction(0x2538, 0x109, "drawMouseCursor") { drawMouseCursor_2538_0109_5489() }
  fun drawMouseCursor_2538_0109_5489(): Runnable {
    // vgaDriver.setDiFromXYCordsDxBx_2538_0C10_5F90();

    return farRet()
  }

  // Not providing stub for vgaDriver.restoreImageUnderMouseCursor. Reason: Function already has an override

  // defineFunction(0x2538, 0x10F, "blit") { blit_2538_010F_548F() }
  fun blit_2538_010F_548F(): Runnable {
    // vgaDriver.setDiFromXYCordsDxBx_2538_0C10_5F90();

    return farRet()
  }

  // defineFunction(0x2538, 0x112, "unknown") { unknown_2538_0112_5492() }
  fun unknown_2538_0112_5492(): Runnable {
    // vgaDriver.setDiFromXYCordsDxBx_2538_0C10_5F90();

    return farRet()
  }

  // defineFunction(0x2538, 0x115, "unknown") { unknown_2538_0115_5495() }
  fun unknown_2538_0115_5495(): Runnable {
    // vgaDriver.setDiFromXYCordsDxBx_2538_0C10_5F90();

    return farRet()
  }

  // Not providing stub for vgaDriver.fillWithZeroFor64000AtES. Reason: Function already has an override

  // defineFunction(0x2538, 0x11B, "unknown") { unknown_2538_011B_549B() }
  fun unknown_2538_011B_549B(): Runnable {
    // vgaDriver.setDiFromXYCordsDxBx_2538_0C10_5F90();

    return farRet()
  }

  // defineFunction(0x2538, 0x11E, "unknown") { unknown_2538_011E_549E() }
  fun unknown_2538_011E_549E(): Runnable {
    // vgaDriver.setDiFromXYCordsDxBx_2538_0C10_5F90();

    return farRet()
  }

  // Not providing stub for vgaDriver.memcpyDSToESFor64000. Reason: Function already has an override

  // defineFunction(0x2538, 0x124, "copyRectangle") { copyRectangle_2538_0124_54A4() }
  fun copyRectangle_2538_0124_54A4(): Runnable {
    // vgaDriver.setDiFromXYCordsDxBx_2538_0C10_5F90();

    return farRet()
  }

  // Not providing stub for vgaDriver.copySquareOfPixelsSiIsSourceSegment. Reason: Function already has an override

  // Not providing stub for vgaDriver.memcpyDSToESFor64000. Reason: Function already has an override

  // Not providing stub for vgaDriver.copySquareOfPixels. Reason: Function already has an override

  // defineFunction(0x2538, 0x133, "copyframebufferExplodeAndCenter") { copyframebufferExplodeAndCenter_2538_0133_54B3() }
  fun copyframebufferExplodeAndCenter_2538_0133_54B3(): Runnable {
    // interrupt_handler_0x8_01ED_EF6A_0E3A();
    // vgaDriver.setDiFromXYCordsDxBx_2538_0C10_5F90();

    return farRet()
  }

  // defineFunction(0x2538, 0x136, "unknown") { unknown_2538_0136_54B6() }
  fun unknown_2538_0136_54B6(): Runnable {

    return farRet()
  }

  // defineFunction(0x2538, 0x139, "unknown") { unknown_2538_0139_54B9() }
  fun unknown_2538_0139_54B9(): Runnable {
    // unknown_2538_1ADC_6E5C();

    return farRet()
  }

  // Not providing stub for vgaDriver.noOp. Reason: Function already has an override

  // defineFunction(0x2538, 0x142, "unknown") { unknown_2538_0142_54C2() }
  fun unknown_2538_0142_54C2(): Runnable {
    // vgaDriver.setDiFromXYCordsDxBx_2538_0C10_5F90();
    // unknown_2538_2413_7793();

    return farRet()
  }

  // defineFunction(0x2538, 0x145, "unknown") { unknown_2538_0145_54C5() }
  fun unknown_2538_0145_54C5(): Runnable {
    // vgaDriver.unknownGlobeRelated_2538_1D07_7087();
    // vgaDriver.unknownGlobeInitRelated_2538_1D5A_70DA();

    return farRet()
  }

  // defineFunction(0x2538, 0x148, "unknown") { unknown_2538_0148_54C8() }
  fun unknown_2538_0148_54C8(): Runnable {

    return farRet()
  }

  // defineFunction(0x2538, 0x14B, "unknown") { unknown_2538_014B_54CB() }
  fun unknown_2538_014B_54CB(): Runnable {
    // vgaDriver.setDiFromXYCordsDxBx_2538_0C10_5F90();

    return farRet()
  }

  // defineFunction(0x2538, 0x14E, "unknown") { unknown_2538_014E_54CE() }
  fun unknown_2538_014E_54CE(): Runnable {
    // vgaDriver.setDiFromXYCordsDxBx_2538_0C10_5F90();

    return farRet()
  }

  // defineFunction(0x2538, 0x151, "unknown") { unknown_2538_0151_54D1() }
  fun unknown_2538_0151_54D1(): Runnable {
    // vgaDriver.setBxCxPaletteRelated_2538_0A21_5DA1();
    // unknown_2538_0B0C_5E8C();
    // vgaDriver.loadPalette_2538_0B68_5EE8();
    // vgaDriver.setDiFromXYCordsDxBx_2538_0C10_5F90();
    // vgaDriver.memcpyDSToESFor64000_2538_1B7C_6EFC();
    // vgaDriver.retraceRelatedCalledOnEnterGlobe_2538_253D_78BD();
    // vgaDriver.waitForRetraceInTransitions_2538_2572_78F2();
    // unknown_2538_2596_7916();
    // vgaDriver.waitForRetraceDuringIntroVideo_2538_261D_799D();
    // unknown_2538_26E3_7A63();
    // unknown_2538_2AB0_7E30();
    // unknown_2538_2B56_7ED6();
    // unknown_2538_2BAC_7F2C();
    // unknown_2538_2C02_7F82();
    // unknown_2538_2C52_7FD2();

    return farRet()
  }

  // defineFunction(0x2538, 0x154, "unknown") { unknown_2538_0154_54D4() }
  fun unknown_2538_0154_54D4(): Runnable {
    // vgaDriver.waitForRetrace_2538_09B8_5D38();
    // vgaDriver.loadPalette_2538_0B68_5EE8();

    return farRet()
  }

  // defineFunction(0x2538, 0x157, "unknown") { unknown_2538_0157_54D7() }
  fun unknown_2538_0157_54D7(): Runnable {
    // vgaDriver.unknownMapRelated_2538_2025_73A5();
    // unknown_2538_2123_74A3();
    // unknown_2538_2153_74D3();

    return farRet()
  }

  // defineFunction(0x2538, 0x15A, "unknown") { unknown_2538_015A_54DA() }
  fun unknown_2538_015A_54DA(): Runnable {
    // vgaDriver.setDiFromXYCordsDxBx_2538_0C10_5F90();
    // vgaDriver.moveSquareOfPixels_2538_1B8E_6F0E();
    // vgaDriver.waitForRetraceInTransitions_2538_2572_78F2();
    // vgaDriver.generateMenuTransitionFrame_2538_32C1_8641();
    // unknown_2538_35C8_8948();
    // unknown_2538_36B0_8A30();
    // unknown_2538_372D_8AAD();
    // unknown_2538_37B1_8B31();

    return farRet()
  }

  // defineFunction(0x2538, 0x15D, "unknown") { unknown_2538_015D_54DD() }
  fun unknown_2538_015D_54DD(): Runnable {
    // vgaDriver.setDiFromXYCordsDxBx_2538_0C10_5F90();

    return farRet()
  }

  // defineFunction(0x2538, 0x160, "unknown") { unknown_2538_0160_54E0() }
  fun unknown_2538_0160_54E0(): Runnable {
    // vgaDriver.loadPalette_2538_0B68_5EE8();

    return farRet()
  }

  // Not providing stub for vgaDriver.updateVgaOffset01A3FromLineNumberAsAx. Reason: Function already has an override

  // defineFunction(0x2538, 0x169, "unknown") { unknown_2538_0169_54E9() }
  fun unknown_2538_0169_54E9(): Runnable {
    // vgaDriver.setDiFromXYCordsDxBx_2538_0C10_5F90();

    return farRet()
  }

  // Not providing stub for vgaDriver.generateTextureOutBP. Reason: Function already has an override

  // defineFunction(0x2538, 0x16F, "unknown") { unknown_2538_016F_54EF() }
  fun unknown_2538_016F_54EF(): Runnable {
    // vgaDriver.setDiFromXYCordsDxBx_2538_0C10_5F90();

    return farRet()
  }

  // defineFunction(0x2538, 0x17B, "copyPalette2toPalette1") { copyPalette2toPalette1_2538_017B_54FB() }
  fun copyPalette2toPalette1_2538_017B_54FB(): Runnable {
    // vgaDriver.copyCsRamB5FToB2F_2538_0A58_5DD8();

    return farRet()
  }

  // defineFunction(0x2538, 0x187, "unknown") { unknown_2538_0187_5507() }
  fun unknown_2538_0187_5507(): Runnable {

    return farRet()
  }

  // Not providing stub for vgaDriver.waitForRetrace. Reason: Function already has an override

  // Not providing stub for vgaDriver.setBxCxPaletteRelated. Reason: Function already has an override

  // Not providing stub for vgaDriver.copyCsRamB5FToB2F. Reason: Function already has an override

  // defineFunction(0x2538, 0xB0C, "unknown") { unknown_2538_0B0C_5E8C() }
  fun unknown_2538_0B0C_5E8C(): Runnable {
    // vgaDriver.loadPalette_2538_0B68_5EE8();

    return farRet()
  }

  // Not providing stub for vgaDriver.loadPalette. Reason: Function already has an override

  // Not providing stub for vgaDriver.setDiFromXYCordsDxBx. Reason: Function already has an override

  // defineFunction(0x2538, 0x1ADC, "unknown") { unknown_2538_1ADC_6E5C() }
  fun unknown_2538_1ADC_6E5C(): Runnable {
    // vgaDriver.setDiFromXYCordsDxBx_2538_0C10_5F90();

    return nearRet()
  }

  // Not providing stub for vgaDriver.memcpyDSToESFor64000. Reason: Function already has an override

  // Not providing stub for vgaDriver.moveSquareOfPixels. Reason: Function already has an override

  // defineFunction(0x2538, 0x1D07, "unknownGlobeRelated") { unknownGlobeRelated_2538_1D07_7087() }
  fun unknownGlobeRelated_2538_1D07_7087(): Runnable {

    return farRet()
  }

  // Not providing stub for vgaDriver.unknownGlobeInitRelated. Reason: Function already has an override

  // defineFunction(0x2538, 0x2025, "unknownMapRelated") { unknownMapRelated_2538_2025_73A5() }
  fun unknownMapRelated_2538_2025_73A5(): Runnable {

    return nearRet()
  }

  // defineFunction(0x2538, 0x2123, "unknown") { unknown_2538_2123_74A3() }
  fun unknown_2538_2123_74A3(): Runnable {
    // vgaDriver.copyMapBlock_2538_2343_76C3();

    return nearRet()
  }

  // defineFunction(0x2538, 0x2153, "unknown") { unknown_2538_2153_74D3() }
  fun unknown_2538_2153_74D3(): Runnable {
    // vgaDriver.copyMapBlock_2538_2343_76C3();

    return nearRet()
  }

  // Not providing stub for vgaDriver.copyMapBlock. Reason: Function already has an override

  // defineFunction(0x2538, 0x2396, "unknown") { unknown_2538_2396_7716() }
  fun unknown_2538_2396_7716(): Runnable {

    return nearRet()
  }

  // defineFunction(0x2538, 0x23D7, "unknown") { unknown_2538_23D7_7757() }
  fun unknown_2538_23D7_7757(): Runnable {

    return nearRet()
  }

  // defineFunction(0x2538, 0x2413, "unknown") { unknown_2538_2413_7793() }
  fun unknown_2538_2413_7793(): Runnable {
    // unknown_2538_2396_7716();
    // unknown_2538_23D7_7757();

    return nearRet()
  }

  // Not providing stub for vgaDriver.retraceRelatedCalledOnEnterGlobe. Reason: Function already has an override

  // Not providing stub for vgaDriver.waitForRetraceInTransitions. Reason: Function already has an override

  // defineFunction(0x2538, 0x2596, "unknown") { unknown_2538_2596_7916() }
  fun unknown_2538_2596_7916(): Runnable {
    // vgaDriver.memcpyDSToESFor64000_2538_1B7C_6EFC();

    return nearRet()
  }

  // Not providing stub for vgaDriver.waitForRetraceDuringIntroVideo. Reason: Function already has an override

  // defineFunction(0x2538, 0x26E3, "unknown") { unknown_2538_26E3_7A63() }
  fun unknown_2538_26E3_7A63(): Runnable {
    // vgaDriver.loadPalette_2538_0B68_5EE8();
    // vgaDriver.waitForRetraceDuringIntroVideo_2538_261D_799D();

    return nearRet()
  }

  // defineFunction(0x2538, 0x2AB0, "unknown") { unknown_2538_2AB0_7E30() }
  fun unknown_2538_2AB0_7E30(): Runnable {

    return nearRet()
  }

  // defineFunction(0x2538, 0x2B56, "unknown") { unknown_2538_2B56_7ED6() }
  fun unknown_2538_2B56_7ED6(): Runnable {

    return nearRet()
  }

  // defineFunction(0x2538, 0x2BAC, "unknown") { unknown_2538_2BAC_7F2C() }
  fun unknown_2538_2BAC_7F2C(): Runnable {

    return nearRet()
  }

  // defineFunction(0x2538, 0x2C02, "unknown") { unknown_2538_2C02_7F82() }
  fun unknown_2538_2C02_7F82(): Runnable {

    return nearRet()
  }

  // defineFunction(0x2538, 0x2C52, "unknown") { unknown_2538_2C52_7FD2() }
  fun unknown_2538_2C52_7FD2(): Runnable {

    return nearRet()
  }

  // defineFunction(0x2538, 0x32C1, "generateMenuTransitionFrame") { generateMenuTransitionFrame_2538_32C1_8641() }
  fun generateMenuTransitionFrame_2538_32C1_8641(): Runnable {

    return nearRet()
  }

  // defineFunction(0x2538, 0x35C8, "unknown") { unknown_2538_35C8_8948() }
  fun unknown_2538_35C8_8948(): Runnable {

    return nearRet()
  }

  // defineFunction(0x2538, 0x36B0, "unknown") { unknown_2538_36B0_8A30() }
  fun unknown_2538_36B0_8A30(): Runnable {

    return nearRet()
  }

  // defineFunction(0x2538, 0x372D, "unknown") { unknown_2538_372D_8AAD() }
  fun unknown_2538_372D_8AAD(): Runnable {
    // vgaDriver.setDiFromXYCordsDxBx_2538_0C10_5F90();

    return nearRet()
  }

  // defineFunction(0x2538, 0x37B1, "unknown") { unknown_2538_37B1_8B31() }
  fun unknown_2538_37B1_8B31(): Runnable {
    // vgaDriver.setDiFromXYCordsDxBx_2538_0C10_5F90();

    return nearRet()
  }

  // Not providing stub for soundDriverPcSpeaker.pcSpeakerActivationWithBXAndALCleanup. Reason: Function already has an override

  // Not providing stub for soundDriverPcSpeaker.clearAL. Reason: Function already has an override

  // Not providing stub for soundDriverPcSpeaker.clearAL. Reason: Function already has an override

  // Not providing stub for soundDriverPcSpeaker.clearAL. Reason: Function already has an override

  // Not providing stub for soundDriverPcSpeaker.pcSpeakerActivationWithBXAndALCleanup. Reason: Function already has an override

  // defineFunction(0x482B, 0x103, "unknown") { unknown_482B_0103_83B3() }
  fun unknown_482B_0103_83B3(): Runnable {

    return farRet()
  }

  // Not providing stub for soundDriverPcSpeaker.clearAL. Reason: Function already has an override

  // defineFunction(0x482B, 0x109, "unknown") { unknown_482B_0109_83B9() }
  fun unknown_482B_0109_83B9(): Runnable {

    return farRet()
  }

  // defineFunction(0x482B, 0x10C, "unknown") { unknown_482B_010C_83BC() }
  fun unknown_482B_010C_83BC(): Runnable {

    return farRet()
  }

  // defineFunction(0x482B, 0x10F, "unknown") { unknown_482B_010F_83BF() }
  fun unknown_482B_010F_83BF(): Runnable {

    return farRet()
  }

  // Not providing stub for soundDriverPcSpeaker.clearAL. Reason: Function already has an override

  // Not providing stub for providedInterrupts.provided_interrupt_handler_0x10. Reason: Function already has an override

  // Not providing stub for providedInterrupts.provided_interrupt_handler_0x21. Reason: Function already has an override

  // Not providing stub for providedInterrupts.provided_interrupt_handler_0x33. Reason: Function already has an override
}
