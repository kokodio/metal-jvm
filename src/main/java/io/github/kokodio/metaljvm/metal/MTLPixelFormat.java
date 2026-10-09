package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLPixelFormat}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlpixelformat">Apple documentation</a>
 */
public enum MTLPixelFormat {
    Invalid(0L),
    A8Unorm(1L),
    R8Unorm(10L),
    R8Unorm_sRGB(11L),
    R8Snorm(12L),
    R8Uint(13L),
    R8Sint(14L),
    R16Unorm(20L),
    R16Snorm(22L),
    R16Uint(23L),
    R16Sint(24L),
    R16Float(25L),
    RG8Unorm(30L),
    RG8Unorm_sRGB(31L),
    RG8Snorm(32L),
    RG8Uint(33L),
    RG8Sint(34L),
    B5G6R5Unorm(40L),
    A1BGR5Unorm(41L),
    ABGR4Unorm(42L),
    BGR5A1Unorm(43L),
    RGB8Unorm(45L),
    RGB8Snorm(46L),
    RGB8Uint(47L),
    RGB8Sint(48L),
    R32Uint(53L),
    R32Sint(54L),
    R32Float(55L),
    RG16Unorm(60L),
    RG16Snorm(62L),
    RG16Uint(63L),
    RG16Sint(64L),
    RG16Float(65L),
    RGBA8Unorm(70L),
    RGBA8Unorm_sRGB(71L),
    RGBA8Snorm(72L),
    RGBA8Uint(73L),
    RGBA8Sint(74L),
    BGRA8Unorm(80L),
    BGRA8Unorm_sRGB(81L),
    RGB10A2Unorm(90L),
    RGB10A2Uint(91L),
    RG11B10Float(92L),
    RGB9E5Float(93L),
    BGR10A2Unorm(94L),
    BGR10_XR(554L),
    BGR10_XR_sRGB(555L),
    RGB16Unorm(95L),
    RGB16Snorm(96L),
    RGB16Uint(97L),
    RGB16Sint(98L),
    RGB16Float(99L),
    RG32Uint(103L),
    RG32Sint(104L),
    RG32Float(105L),
    RGBA16Unorm(110L),
    RGBA16Snorm(112L),
    RGBA16Uint(113L),
    RGBA16Sint(114L),
    RGBA16Float(115L),
    BGRA10_XR(552L),
    BGRA10_XR_sRGB(553L),
    RGB32Uint(120L),
    RGB32Sint(121L),
    RGB32Float(122L),
    RGBA32Uint(123L),
    RGBA32Sint(124L),
    RGBA32Float(125L),
    BC1_RGBA(130L),
    BC1_RGBA_sRGB(131L),
    BC2_RGBA(132L),
    BC2_RGBA_sRGB(133L),
    BC3_RGBA(134L),
    BC3_RGBA_sRGB(135L),
    BC4_RUnorm(140L),
    BC4_RSnorm(141L),
    BC5_RGUnorm(142L),
    BC5_RGSnorm(143L),
    BC6H_RGBFloat(150L),
    BC6H_RGBUfloat(151L),
    BC7_RGBAUnorm(152L),
    BC7_RGBAUnorm_sRGB(153L),
    PVRTC_RGB_2BPP(160L),
    PVRTC_RGB_2BPP_sRGB(161L),
    PVRTC_RGB_4BPP(162L),
    PVRTC_RGB_4BPP_sRGB(163L),
    PVRTC_RGBA_2BPP(164L),
    PVRTC_RGBA_2BPP_sRGB(165L),
    PVRTC_RGBA_4BPP(166L),
    PVRTC_RGBA_4BPP_sRGB(167L),
    EAC_R11Unorm(170L),
    EAC_R11Snorm(172L),
    EAC_RG11Unorm(174L),
    EAC_RG11Snorm(176L),
    EAC_RGBA8(178L),
    EAC_RGBA8_sRGB(179L),
    ETC2_RGB8(180L),
    ETC2_RGB8_sRGB(181L),
    ETC2_RGB8A1(182L),
    ETC2_RGB8A1_sRGB(183L),
    ASTC_4x4_sRGB(186L),
    ASTC_5x4_sRGB(187L),
    ASTC_5x5_sRGB(188L),
    ASTC_6x5_sRGB(189L),
    ASTC_6x6_sRGB(190L),
    ASTC_8x5_sRGB(192L),
    ASTC_8x6_sRGB(193L),
    ASTC_8x8_sRGB(194L),
    ASTC_10x5_sRGB(195L),
    ASTC_10x6_sRGB(196L),
    ASTC_10x8_sRGB(197L),
    ASTC_10x10_sRGB(198L),
    ASTC_12x10_sRGB(199L),
    ASTC_12x12_sRGB(200L),
    ASTC_4x4_LDR(204L),
    ASTC_5x4_LDR(205L),
    ASTC_5x5_LDR(206L),
    ASTC_6x5_LDR(207L),
    ASTC_6x6_LDR(208L),
    ASTC_8x5_LDR(210L),
    ASTC_8x6_LDR(211L),
    ASTC_8x8_LDR(212L),
    ASTC_10x5_LDR(213L),
    ASTC_10x6_LDR(214L),
    ASTC_10x8_LDR(215L),
    ASTC_10x10_LDR(216L),
    ASTC_12x10_LDR(217L),
    ASTC_12x12_LDR(218L),
    ASTC_4x4_HDR(222L),
    ASTC_5x4_HDR(223L),
    ASTC_5x5_HDR(224L),
    ASTC_6x5_HDR(225L),
    ASTC_6x6_HDR(226L),
    ASTC_8x5_HDR(228L),
    ASTC_8x6_HDR(229L),
    ASTC_8x8_HDR(230L),
    ASTC_10x5_HDR(231L),
    ASTC_10x6_HDR(232L),
    ASTC_10x8_HDR(233L),
    ASTC_10x10_HDR(234L),
    ASTC_12x10_HDR(235L),
    ASTC_12x12_HDR(236L),
    GBGR422(240L),
    BGRG422(241L),
    Depth16Unorm(250L),
    Depth32Float(252L),
    Stencil8(253L),
    Depth24Unorm_Stencil8(255L),
    Depth32Float_Stencil8(260L),
    X32_Stencil8(261L),
    X24_Stencil8(262L),
    Unspecialized(263L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public final long value;

    MTLPixelFormat(final long value) {
        this.value = value;
    }

    public static MTLPixelFormat of(final long value) {
        if ((int) value == value) {
            switch ((int) value) {
                case 0: return Invalid;
                case 1: return A8Unorm;
                case 10: return R8Unorm;
                case 11: return R8Unorm_sRGB;
                case 12: return R8Snorm;
                case 13: return R8Uint;
                case 14: return R8Sint;
                case 20: return R16Unorm;
                case 22: return R16Snorm;
                case 23: return R16Uint;
                case 24: return R16Sint;
                case 25: return R16Float;
                case 30: return RG8Unorm;
                case 31: return RG8Unorm_sRGB;
                case 32: return RG8Snorm;
                case 33: return RG8Uint;
                case 34: return RG8Sint;
                case 40: return B5G6R5Unorm;
                case 41: return A1BGR5Unorm;
                case 42: return ABGR4Unorm;
                case 43: return BGR5A1Unorm;
                case 45: return RGB8Unorm;
                case 46: return RGB8Snorm;
                case 47: return RGB8Uint;
                case 48: return RGB8Sint;
                case 53: return R32Uint;
                case 54: return R32Sint;
                case 55: return R32Float;
                case 60: return RG16Unorm;
                case 62: return RG16Snorm;
                case 63: return RG16Uint;
                case 64: return RG16Sint;
                case 65: return RG16Float;
                case 70: return RGBA8Unorm;
                case 71: return RGBA8Unorm_sRGB;
                case 72: return RGBA8Snorm;
                case 73: return RGBA8Uint;
                case 74: return RGBA8Sint;
                case 80: return BGRA8Unorm;
                case 81: return BGRA8Unorm_sRGB;
                case 90: return RGB10A2Unorm;
                case 91: return RGB10A2Uint;
                case 92: return RG11B10Float;
                case 93: return RGB9E5Float;
                case 94: return BGR10A2Unorm;
                case 554: return BGR10_XR;
                case 555: return BGR10_XR_sRGB;
                case 95: return RGB16Unorm;
                case 96: return RGB16Snorm;
                case 97: return RGB16Uint;
                case 98: return RGB16Sint;
                case 99: return RGB16Float;
                case 103: return RG32Uint;
                case 104: return RG32Sint;
                case 105: return RG32Float;
                case 110: return RGBA16Unorm;
                case 112: return RGBA16Snorm;
                case 113: return RGBA16Uint;
                case 114: return RGBA16Sint;
                case 115: return RGBA16Float;
                case 552: return BGRA10_XR;
                case 553: return BGRA10_XR_sRGB;
                case 120: return RGB32Uint;
                case 121: return RGB32Sint;
                case 122: return RGB32Float;
                case 123: return RGBA32Uint;
                case 124: return RGBA32Sint;
                case 125: return RGBA32Float;
                case 130: return BC1_RGBA;
                case 131: return BC1_RGBA_sRGB;
                case 132: return BC2_RGBA;
                case 133: return BC2_RGBA_sRGB;
                case 134: return BC3_RGBA;
                case 135: return BC3_RGBA_sRGB;
                case 140: return BC4_RUnorm;
                case 141: return BC4_RSnorm;
                case 142: return BC5_RGUnorm;
                case 143: return BC5_RGSnorm;
                case 150: return BC6H_RGBFloat;
                case 151: return BC6H_RGBUfloat;
                case 152: return BC7_RGBAUnorm;
                case 153: return BC7_RGBAUnorm_sRGB;
                case 160: return PVRTC_RGB_2BPP;
                case 161: return PVRTC_RGB_2BPP_sRGB;
                case 162: return PVRTC_RGB_4BPP;
                case 163: return PVRTC_RGB_4BPP_sRGB;
                case 164: return PVRTC_RGBA_2BPP;
                case 165: return PVRTC_RGBA_2BPP_sRGB;
                case 166: return PVRTC_RGBA_4BPP;
                case 167: return PVRTC_RGBA_4BPP_sRGB;
                case 170: return EAC_R11Unorm;
                case 172: return EAC_R11Snorm;
                case 174: return EAC_RG11Unorm;
                case 176: return EAC_RG11Snorm;
                case 178: return EAC_RGBA8;
                case 179: return EAC_RGBA8_sRGB;
                case 180: return ETC2_RGB8;
                case 181: return ETC2_RGB8_sRGB;
                case 182: return ETC2_RGB8A1;
                case 183: return ETC2_RGB8A1_sRGB;
                case 186: return ASTC_4x4_sRGB;
                case 187: return ASTC_5x4_sRGB;
                case 188: return ASTC_5x5_sRGB;
                case 189: return ASTC_6x5_sRGB;
                case 190: return ASTC_6x6_sRGB;
                case 192: return ASTC_8x5_sRGB;
                case 193: return ASTC_8x6_sRGB;
                case 194: return ASTC_8x8_sRGB;
                case 195: return ASTC_10x5_sRGB;
                case 196: return ASTC_10x6_sRGB;
                case 197: return ASTC_10x8_sRGB;
                case 198: return ASTC_10x10_sRGB;
                case 199: return ASTC_12x10_sRGB;
                case 200: return ASTC_12x12_sRGB;
                case 204: return ASTC_4x4_LDR;
                case 205: return ASTC_5x4_LDR;
                case 206: return ASTC_5x5_LDR;
                case 207: return ASTC_6x5_LDR;
                case 208: return ASTC_6x6_LDR;
                case 210: return ASTC_8x5_LDR;
                case 211: return ASTC_8x6_LDR;
                case 212: return ASTC_8x8_LDR;
                case 213: return ASTC_10x5_LDR;
                case 214: return ASTC_10x6_LDR;
                case 215: return ASTC_10x8_LDR;
                case 216: return ASTC_10x10_LDR;
                case 217: return ASTC_12x10_LDR;
                case 218: return ASTC_12x12_LDR;
                case 222: return ASTC_4x4_HDR;
                case 223: return ASTC_5x4_HDR;
                case 224: return ASTC_5x5_HDR;
                case 225: return ASTC_6x5_HDR;
                case 226: return ASTC_6x6_HDR;
                case 228: return ASTC_8x5_HDR;
                case 229: return ASTC_8x6_HDR;
                case 230: return ASTC_8x8_HDR;
                case 231: return ASTC_10x5_HDR;
                case 232: return ASTC_10x6_HDR;
                case 233: return ASTC_10x8_HDR;
                case 234: return ASTC_10x10_HDR;
                case 235: return ASTC_12x10_HDR;
                case 236: return ASTC_12x12_HDR;
                case 240: return GBGR422;
                case 241: return BGRG422;
                case 250: return Depth16Unorm;
                case 252: return Depth32Float;
                case 253: return Stencil8;
                case 255: return Depth24Unorm_Stencil8;
                case 260: return Depth32Float_Stencil8;
                case 261: return X32_Stencil8;
                case 262: return X24_Stencil8;
                case 263: return Unspecialized;
            }
        }
        throw new IllegalArgumentException("Unknown MTLPixelFormat: " + value);
    }
}
