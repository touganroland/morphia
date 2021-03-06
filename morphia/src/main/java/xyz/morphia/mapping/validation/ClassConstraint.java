package xyz.morphia.mapping.validation;


import xyz.morphia.mapping.MappedClass;
import xyz.morphia.mapping.Mapper;

import java.util.Set;


/**
 * @author Uwe Schaefer, (us@thomas-daily.de)
 */
public interface ClassConstraint {
    /**
     * Check that a MappedClass meets the constraint
     *
     * @param mc     the MappedClass to check
     * @param ve     the set of violations
     * @param mapper the Mapper to use for validation
     */
    void check(final Mapper mapper, MappedClass mc, Set<ConstraintViolation> ve);
}
