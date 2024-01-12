package huancun.debug

import chisel3._

trait HasCLikeTypes {
  // c++ firendly data types
  def uint8_t = UInt(8.W)
  def uint32_t = UInt(32.W)
  def uint64_t = UInt(64.W)
}
