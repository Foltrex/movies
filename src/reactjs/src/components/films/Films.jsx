import React from 'react';

import '../../assets/css/films/Films.css';
import '../../assets/css/style.css';
import Pagination from '../Pagination';

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
            <canvas className='films-background'/>
            <div className='container shadow bg-white'>
                <h2 className='title'>Films</h2>
                <div className='movies'>
                    {films}
                </div>

                <Pagination />
            </div>
        </div>
    );
}

export default Films;
