package org.modulo12.core.models

import org.modulo12.core.models.ParseFileResult.Success
import org.modulo12.core.models.{ FileType, ParseFileResult, Song }

import java.io.File
import javax.sound.midi.Sequence

sealed trait FileType
object FileType {
  case object Midi     extends FileType
  case object MusicXML extends FileType
}

sealed trait ParseFileResult
object ParseFileResult {
  case class FileNotFound(path: String)                          extends ParseFileResult
  case class IncorrectFileType(path: String, fileType: FileType) extends ParseFileResult
  case class Success(song: Song)                                 extends ParseFileResult
}
