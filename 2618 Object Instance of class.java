var checkIfInstanceOf = function(obj, classFunction) {
    if (obj === null || obj === undefined) return false;
    if (typeof classFunction !== "function") return false;

    while (obj !== null) {
        if (obj.constructor === classFunction) return true;
        obj = Object.getPrototypeOf(obj);
    }

    return false;
};
