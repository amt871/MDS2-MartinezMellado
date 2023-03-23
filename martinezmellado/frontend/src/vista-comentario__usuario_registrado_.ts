import { LitElement, html, css, customElement } from 'lit-element';
import './vista-mi_cabecera';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';
import './vista-comentario__usuario_registrado__item';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-comentario__usuario_registrado_')
export class VistaComentario__usuario_registrado_ extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
 <vista-mi_cabecera style="height: 5%; width: 100%;"></vista-mi_cabecera>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; padding: var(--lumo-space-xl);">
  <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
   <img id="id Video" style="width: 100%; height: 100%;" src="../../resources/icons/video.png">
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="height: 100%; width: 100%; align-items: center; justify-content: center;">
   <iron-icon id="idFotoPerfil" style="width: 30%; height: 30%;" icon="lumo:user"></iron-icon>
   <label id="IdNombreUsuarioPubl">Usuario Publicación</label>
   <vaadin-horizontal-layout style="justify-content: center; align-items: center; width: 100%;">
    <vaadin-horizontal-layout style="width: 100%; height: 100%; align-items: center; justify-content: center;">
     <label id="idFecha">Fecha</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout style="width: 100%; height: 100%; justify-content: center; align-items: center;">
     <label id="idUbicación">Ubicación </label>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-scroller style="height: 40%;">
    <vista-comentario__usuario_registrado__item></vista-comentario__usuario_registrado__item>
    <vista-comentario__usuario_registrado__item></vista-comentario__usuario_registrado__item>
    <vista-comentario__usuario_registrado__item></vista-comentario__usuario_registrado__item>
    <vista-comentario__usuario_registrado__item></vista-comentario__usuario_registrado__item>
   </vaadin-scroller>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
    <vaadin-horizontal-layout theme="spacing" style="justify-content: flex-start; width: 100%;">
     <vaadin-button id="BVolver">
      Volver
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="justify-content: flex-end; width: 100%;">
     <vaadin-button id="BAnadirComentario">
      Añadir Comentario
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
