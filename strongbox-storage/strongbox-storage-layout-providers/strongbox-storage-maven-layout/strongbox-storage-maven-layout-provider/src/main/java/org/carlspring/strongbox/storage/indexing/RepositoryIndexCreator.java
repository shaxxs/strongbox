package org.carlspring.strongbox.storage.indexing;

import org.carlspring.strongbox.providers.io.RepositoryPath;
import org.carlspring.strongbox.storage.repository.Repository;
import org.carlspring.strongbox.storage.repository.RepositoryTypeEnum;
import org.carlspring.strongbox.util.ThrowingFunction;

import javax.inject.Qualifier;
import java.io.IOException;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author Przemyslaw Fusik
 */
public interface RepositoryIndexCreator
        extends ThrowingFunction<Repository, RepositoryPath, IOException>
{

    @Qualifier
    @Retention(RUNTIME)
    @interface RepositoryIndexCreatorQualifier
    {

        RepositoryTypeEnum value();
    }
}
