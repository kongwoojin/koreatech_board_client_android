package com.kongjak.koreatechboard.domain.usecase

import com.kongjak.koreatechboard.domain.model.Board
import com.kongjak.koreatechboard.domain.repository.BoardRepository
import kotlinx.coroutines.flow.Flow

class GetBoardUseCase(private val boardRepository: BoardRepository) {
    suspend fun execute(site: String, board: String, page: Int): Flow<ArrayList<Board>> {
        return boardRepository.getBoard(site, board, page)
    }
}