import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera__administrador_';
import './vista-videos_perfil_bloqueado';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-ver_perfil_bloqueado')
export class VistaVer_perfil_bloqueado extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vista-cabecera__administrador_ style="width: 100%; height: 5%;"></vista-cabecera__administrador_>
 <vaadin-horizontal-layout style="width: 100%; height: 10%; justify-content: space-between; align-items: center; align-self: center; margin-top: var(--lumo-space-m);">
  <vaadin-horizontal-layout theme="spacing" style="margin-left: var(--lumo-space-l); width: 33%; align-items: center; justify-content: center; align-self: center;">
   <label style="align-self: center;">Numero de seguidores</label>
  </vaadin-horizontal-layout>
  <img style="height: 100%;" src="../../resources/icons/user.svg">
  <vaadin-horizontal-layout theme="spacing" style="margin-right: var(--lumo-space-l); width: 33%; align-self: center; align-items: center; justify-content: center;">
   <label style="align-self: center;">Numero de me gustas</label>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; align-items: center; justify-content: center;">
  <label style="margin-top: var(--lumo-space-m); margin-bottom: var(--lumo-space-m);">PERFIL BLOQUEADO</label>
 </vaadin-horizontal-layout>
 <vista-videos_perfil_bloqueado style="width: 100%; height: 100%; margin-top: var(--lumo-space-xl);"></vista-videos_perfil_bloqueado>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
