import React from 'react';

import '../../assets/css/films/Films.css';
import Film from './Film';

const Films = () => {
    const films = [
        <Film />,
        <Film />,
        <Film />,
        <Film />,
    ];

    return (
        <div>
            <canvas className='films-background' />
            <div className='films-container container shadow bg-white'>
                <h2 className='films-title'>Films</h2>
                <div className='films'>
                    {films}
                </div>
            </div>
        </div>
    );
}

export default Films;
