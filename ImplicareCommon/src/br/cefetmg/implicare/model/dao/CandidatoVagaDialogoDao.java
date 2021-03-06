package br.cefetmg.implicare.model.dao;

import br.cefetmg.implicare.model.domain.CandidatoVagaDialogo;
import br.cefetmg.implicare.model.exception.PersistenceException;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public interface CandidatoVagaDialogoDao {

    public void insert(CandidatoVagaDialogo CandidatoVagaDialogo) throws PersistenceException;

    public List<CandidatoVagaDialogo> getCandidatoVagaDialogo(long CPF, int Cod_Cargo, long CNPJ, Date Dat_Publicacao) throws PersistenceException;

    public CandidatoVagaDialogo getCandidatoVagaDialogoCod(long CPF, int Cod_Cargo, long CNPJ, Date Dat_Publicacao, Timestamp Dat_Dialogo) throws PersistenceException;
}
