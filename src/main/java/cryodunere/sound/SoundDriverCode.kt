package cryodunere.sound

import spice86.emulator.memory.SegmentedAddress
import spice86.emulator.function.FunctionInformation
import spice86.emulator.machine.Machine
import spice86.emulator.reverseengineer.JavaOverrideHelper
import java.lang.Runnable
import cryodunere.sound.SoundDriverCode
import org.slf4j.LoggerFactory
import spice86.utils.CheckedSupplier
import spice86.emulator.errors.InvalidOperationException

// Method names contain _ to separate addresses.
class SoundDriverCode(functionInformations: Map<SegmentedAddress, FunctionInformation>, programStartSegment: Int,
                      machine: Machine) : JavaOverrideHelper(functionInformations, "soundDriverPcSpeaker", machine) {
    companion object {
        private val LOGGER = LoggerFactory.getLogger(SoundDriverCode::class.java)
        private const val CLEAR_AL = "clearAL"
    }

    val baseSegment1: Int
    val baseSegment2: Int

    init {
        baseSegment1 = 0x4635 + programStartSegment
        defineFunction(baseSegment1, 0x100, "pcSpeakerActivationWithBXAndALCleanup") { pcSpeakerActivationWithBXAndALCleanup_4822_100_48320() }
        defineFunction(baseSegment1, 0x103, CLEAR_AL) { clearAL_4822_103_48323() }
        defineFunction(baseSegment1, 0x109, CLEAR_AL) { clearAL_4822_109_48329() }
        defineFunction(baseSegment1, 0x10C, CLEAR_AL) { clearAL_4822_10C_4832C() }
        defineFunction(baseSegment1, 0x115, CLEAR_AL) { clearAL_4822_115_48335() }
        defineFunction(baseSegment1, 0x182, "pcSpeakerActivationWithALCleanup") { pcSpeakerActivationWithALCleanup_4822_182_483A2() }
        defineFunction(baseSegment1, 0x188, "pcSpeakerActivation") { pcSpeakerActivation_4822_188_483A8() }
        baseSegment2 = 0x463E + programStartSegment
        defineFunction(baseSegment2, 0x100, "pcSpeakerActivationWithBXAndALCleanup") { pcSpeakerActivationWithBXAndALCleanup_482B_100_483B0() }
        defineFunction(baseSegment2, 0x106, CLEAR_AL) { clearAL_482B_106_483B6() }
        defineFunction(baseSegment2, 0x112, CLEAR_AL) { clearAL_482B_112_483C2() }
        defineFunction(baseSegment2, 0x182, "pcSpeakerActivationWithALCleanup") { pcSpeakerActivationWithALCleanup_482B_182_48432() }
        defineFunction(baseSegment2, 0x188, "pcSpeakerActivation") { pcSpeakerActivation_482B_188_48438() }
    }

    fun pcSpeakerActivationWithBXAndALCleanup_4822_100_48320(): Runnable {
        pcSpeakerActivationWithALCleanup_4822_182_483A2()
        state.bx = 0
        return farRet()
    }

    fun clearAL_4822_103_48323(): Runnable {
        return soundUnsupportedFarRet()
    }

    fun clearAL_4822_109_48329(): Runnable {
        return soundUnsupportedFarRet()
    }

    fun clearAL_4822_10C_4832C(): Runnable {
        return soundUnsupportedFarRet()
    }

    fun clearAL_4822_115_48335(): Runnable {
        return soundUnsupportedFarRet()
    }

    fun pcSpeakerActivationWithALCleanup_4822_182_483A2(): Runnable {
        pcSpeakerActivation_4822_188_483A8()
        return soundUnsupportedFarRet()
    }

    fun pcSpeakerActivationWithBXAndALCleanup_482B_100_483B0(): Runnable {
        LOGGER.debug("PC Speaker activation with BX and AL cleanup")
        pcSpeakerActivationWithALCleanup_482B_182_48432()
        state.bx = 0
        return farRet()
    }

    fun pcSpeakerActivation_4822_188_483A8(): Runnable {
        LOGGER.debug("Other PC Speaker activation")
        return nearRet()
    }

    fun pcSpeakerActivationWithALCleanup_482B_182_48432(): Runnable {
        LOGGER.debug("PC Speaker activation with AL cleanup")
        pcSpeakerActivation_482B_188_48438()
        return soundUnsupportedFarRet()
    }

    fun pcSpeakerActivation_482B_188_48438(): Runnable {
        LOGGER.debug("PC Speaker activation")
        return nearRet()
    }

    fun clearAL_482B_106_483B6(): Runnable {
        return soundUnsupportedFarRet()
    }

    fun clearAL_482B_112_483C2(): Runnable {
        return soundUnsupportedFarRet()
    }

    private fun soundUnsupportedFarRet(): Runnable {
        // 483A5
        state.al = 0
        return farRet()
    }
}